package org.daimt.home.starter;

import com.github.pagehelper.PageInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;

@ConditionalOnClass(PageInterceptor.class)
public class PageInterceptorAutoConfiguration {
    @Bean
    public PageInterceptor pageInterceptor(){
        return new PageInterceptor();
    }
}
