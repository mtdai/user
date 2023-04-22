package org.daimt.home.study.importanno.cache;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class MyCacheSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        Map<String, Object> annotationAttributes = annotationMetadata.getAnnotationAttributes(EnableMyCache.class.getName());
        CacheType  type = (CacheType)annotationAttributes.get("type");

        switch (type){
            case LOCAL:
                return new String[]{
                        LocalServiceImpl.class.getName()
                };
            case REDIS:
                return new String[]{
                        RedisServiceImpl.class.getName()
                };
            default:
                throw new RuntimeException();
        }

    }

}