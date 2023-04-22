package org.daimt.home.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class UserApplication {

    private final static Logger logger = LoggerFactory.getLogger(UserApplication.class);



    public static void main(String[] args) throws Exception{
        SpringApplication.run(UserApplication.class, args);

        logger.debug("-----------------debug----------------------");
        logger.info("-----------------info----------------------");
        logger.warn("-----------------warn----------------------");
        logger.error("-----------------error----------------------");

        File f = new File("/Users/daimingtao/.m2/repository/ch/qos/logback/logback-core/1.2.11/logback-core-1.2.11.jar!/META-INF/MANIFEST.MF");
        System.out.println(f.exists());
    }
}
