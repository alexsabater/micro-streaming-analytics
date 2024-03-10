# Usar la imagen base con JDK 17
FROM openjdk:17-oracle AS build

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo de construcción de la aplicación al contenedor
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

# Empaquetar la aplicación Spring Boot
RUN ./mvnw package

# Pasar a una nueva etapa para reducir el tamaño de la imagen final
FROM openjdk:17-oracle

# Copiar el JAR de la etapa de construcción
COPY --from=build /app/target/*.jar app.jar

# Comando para ejecutar la aplicación
ENTRYPOINT ["java","-jar","/app.jar"]