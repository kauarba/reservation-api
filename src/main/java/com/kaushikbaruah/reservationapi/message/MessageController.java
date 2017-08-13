package com.kaushikbaruah.reservationapi.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageController {

    private final String value;

    @Autowired
    public MessageController(@Value ("${message}") String value){
        this.value = value;
    }

    @RequestMapping("/message")
    public String read(){
        return this.value;
    }
}
