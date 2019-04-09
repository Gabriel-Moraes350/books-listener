package com.example.listener.example.serviceImpl;

import com.example.listener.example.service.CustomEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class CustomEmailServiceImpl implements CustomEmailService {
    @Autowired
    private JavaMailSender mailSender;

    @Override
    @Async
    public void send(String to, String subject, String text) {

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setFrom("gabriel.m.baptista@gmail.com");
        simpleMailMessage.setText(text);
        mailSender.send(simpleMailMessage);
    }
}
