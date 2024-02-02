package com.nhnacademy.edu.springframework.sender;

import com.nhnacademy.edu.springframework.domain.User;

public class EmailMessageSender implements MessageSender{
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("EmailMessage send to " + user.getEmail() + " : " + message);
    }

    public void destroy() {
        System.out.println("destroy method called in EmailMessageSender");
    }
}
