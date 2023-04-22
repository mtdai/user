package org.daimt.home.starter;

import org.daimt.home.study.SmsRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@EnableConfigurationProperties(SmsProperties.class)
@ConditionalOnBean(SmsRunner.class)
public class SmsAutoConfiguration {

    public SmsAutoConfiguration(){
        System.out.println("----------------------new SmsRunner---------------------------------");
    }

    @Bean
    public SmsSender smsSender(){
        return new SmsSender();
    }
}
