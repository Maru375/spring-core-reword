package com.nhnacademy.edu.springframework.configuration;

import com.nhnacademy.edu.springframework.annotation.SMS;
import com.nhnacademy.edu.springframework.aop.MethodAspect;
import com.nhnacademy.edu.springframework.sender.SmsMessageSender;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ImportResource("classpath:/beans.xml")
public class MainConfig {

    @Bean
    @SMS
    public SmsMessageSender smsMessageSender() {
        SmsMessageSender smsMessageSender = new SmsMessageSender();
        smsMessageSender.init();
        return smsMessageSender;
    }

    @Bean
    public MessageSendService messageSendService(SmsMessageSender smsMessageSender) {
        return new MessageSendService(smsMessageSender);
    }

    @Bean
    public MethodAspect methodAspect(){
        return new MethodAspect();
    }
}
