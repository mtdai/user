package org.daimt.home.study;

import org.daimt.home.starter.SmsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SmsRunner implements ApplicationRunner {

    @Autowired
    private SmsSender smsSender;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        smsSender.send("ABCDEFG");
    }
}
