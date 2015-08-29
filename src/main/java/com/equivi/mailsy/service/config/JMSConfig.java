package com.equivi.mailsy.service.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class JMSConfig {

//    @Value("${jms.broker.config}")
//    private String jmsBrokerConfig;

    @Bean(name = "activemqConnectionFactory")
    public ActiveMQConnectionFactory activeMQConnectionFactory(){
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        activeMQConnectionFactory.setBrokerURL("tcp://localhost:61616");

        return activeMQConnectionFactory;
    }

    @Bean
    public JmsTemplate buildJmsTemplate(){
        return new JmsTemplate(activeMQConnectionFactory());
    }
}
