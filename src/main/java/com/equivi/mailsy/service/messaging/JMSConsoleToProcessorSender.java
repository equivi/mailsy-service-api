package com.equivi.mailsy.service.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.stereotype.Component;

@Component
public class JMSConsoleToProcessorSender {

    @Autowired
    private JmsOperations jmsOperations;

    public void sendToProcessorQueue(Long campaignId){
        jmsOperations.convertAndSend("Q_CONSOLE_TO_PROCESSOR",campaignId);
    }
}
