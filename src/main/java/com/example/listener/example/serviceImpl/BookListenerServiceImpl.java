package com.example.listener.example.serviceImpl;

import com.example.book.models.Book;
import com.example.listener.example.service.BookListernerService;
import com.example.listener.example.service.CustomEmailService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
@Log
public class BookListenerServiceImpl implements BookListernerService {

    @Autowired
    SimpMessagingTemplate template;

    @Override
    @JmsListener(destination = "${queue.books}")
    public void listener(Book book) {

//        emailService.send("gabriel.m.baptista@gmail.com", "teste", "sadsad");
        log.info("Entrou no listener {}" + book.toString());
        template.convertAndSend("/chat", "teste");
    }

    @MessageMapping("/send/message")
    public void socker(String message){
        log.info("Recebida a mensagem do socker" + message);
    }
}
