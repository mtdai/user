package org.daimt.home.study.importanno.cache;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Import({MyCacheSelector.class})
public @interface EnableMyCache {
    CacheType type() default  CacheType.REDIS;
}
