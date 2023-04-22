package org.daimt.home.study.importanno.mapper;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(MyMapperBeanImport.class)
public @interface MyMapperScan {
    /**
     * 扫描包路径
     */
    String[] basePackages() default {};
}



