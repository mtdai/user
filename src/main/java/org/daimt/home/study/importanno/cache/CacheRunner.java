package org.daimt.home.study.importanno.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CacheRunner implements ApplicationRunner {
    @Autowired
    private CacheService cacheService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        cacheService.setData("abc");
    }
}
