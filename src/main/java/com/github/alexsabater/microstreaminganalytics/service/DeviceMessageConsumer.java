package com.github.alexsabater.microstreaminganalytics.service;

import com.github.alexsabater.microstreaminganalytics.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class DeviceMessageConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void receiveMessage(String message) {
        // Aquí convertirías el mensaje JSON a un objeto Java y procesarías el mensaje.
        // Por ejemplo, imprimir el mensaje:
        System.out.println("Received message: " + message);
        // Luego, podrías deserializar y procesar el mensaje como sea necesario.
    }
}