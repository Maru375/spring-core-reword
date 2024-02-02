package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.configuration.MainConfig;
import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.service.MessageSendService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user = new User("TEST@gmail.com", "010-1111-1111");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        context.getBean("messageSendService", MessageSendService.class).doSendMessage(user, "테스트 메세지");
    }
}
