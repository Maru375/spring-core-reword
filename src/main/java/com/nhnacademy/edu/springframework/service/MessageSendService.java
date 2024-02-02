package com.nhnacademy.edu.springframework.service;

import com.nhnacademy.edu.springframework.annotation.SMS;
import com.nhnacademy.edu.springframework.domain.User;
import com.nhnacademy.edu.springframework.sender.MessageSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MessageSendService {
    private final MessageSender messageSender;

    @Autowired
    public MessageSendService(@SMS MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage(User user, String message){
        messageSender.sendMessage(user, message);
    }

}
