package org.daimt.home.study.importanno.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MapperRunner implements ApplicationRunner {
    @Autowired
    private TestMapper mapper;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        mapper.find();
    }
}
