package com.nhnacademy.edu.springframework.sender;

import com.nhnacademy.edu.springframework.domain.User;

public class SmsMessageSender implements MessageSender{

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SmsMessage send to " + user.getPhoneNumber() + " : " + message);
    }

    public void init(){
        System.out.println("init method called in SmsMessageSender");
    }
}
