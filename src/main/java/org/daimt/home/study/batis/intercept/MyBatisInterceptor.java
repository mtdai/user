package org.daimt.home.study.batis.intercept;

import org.daimt.home.study.batis.intercept.SQLPrintInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class MyBatisInterceptor {

    @Bean
    public SQLPrintInterceptor sqlPrintInterceptor(){
        SQLPrintInterceptor sqlStatsInterceptor = new SQLPrintInterceptor();
        Properties properties = new Properties();
        properties. setProperty ("dialect", "mysql");
        sqlStatsInterceptor.setProperties(properties);
        return sqlStatsInterceptor;
    }

//    @Bean
//    public PageInterceptor pageInterceptor(){
//        return new PageInterceptor();
//    }
}
