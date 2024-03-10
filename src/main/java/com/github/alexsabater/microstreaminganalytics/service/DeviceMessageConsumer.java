package com.github.alexsabater.microstreaminganalytics.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.alexsabater.microstreaminganalytics.config.RabbitMQConfig;
import com.github.alexsabater.microstreaminganalytics.dto.OpenGateDataDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceMessageConsumer {

    @Autowired
    private ObjectMapper objectMapper;

    /*
    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void receiveMessage(String message) {
        try {
            OpenGateDataDto deviceData = objectMapper.readValue(message, OpenGateDataDto.class);
            // Aquí podrías llamar a otro servicio para procesar deviceData
            //System.out.println("Received data: " + deviceData.getData());
        } catch (Exception e) {
            e.printStackTrace();
            // Aquí manejarías el error de deserialización
        }
    }
    */

}