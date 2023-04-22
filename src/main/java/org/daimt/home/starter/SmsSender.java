package org.daimt.home.starter;

import org.springframework.beans.factory.annotation.Autowired;

public class SmsSender {

    @Autowired
    private SmsProperties properties;

    public void send(String msg){
        System.out.println("use " + properties.getUser() + " send : " + msg);
    }
}
