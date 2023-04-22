package org.daimt.home.study.importanno.cache;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration
@Component
@EnableMyCache(type = CacheType.LOCAL)
public class CacheConfiguration {
}
