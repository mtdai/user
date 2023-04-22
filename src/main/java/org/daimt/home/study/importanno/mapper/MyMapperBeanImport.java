package org.daimt.home.study.importanno.mapper;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Stream;

public class MyMapperBeanImport implements ImportBeanDefinitionRegistrar, ResourceLoaderAware {
    private final static String PACKAGE_NAME_KEY="basePackages";
    private ResourceLoader resourceLoader;
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
        AnnotationAttributes annotationAttributes = AnnotationAttributes.fromMap(annotationMetadata.getAnnotationAttributes(MyMapperScan.class.getName()));
        if(annotationAttributes ==null||annotationAttributes.isEmpty() ){
            return;
        }
        String[] basePackages  =(String[]) annotationAttributes.get(PACKAGE_NAME_KEY);
        ClassPathBeanDefinitionScanner scanner=new ClassPathBeanDefinitionScanner(registry,false);
        scanner.setResourceLoader(resourceLoader);
        //路径包含MapperBean的注解的bean
        scanner.addIncludeFilter(new AnnotationTypeFilter(MyMapperBean.class));
        scanner.scan(basePackages);
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader=resourceLoader;
//        try {
//            System.out.println(resourceLoader.getResource(ResourceUtils.CLASSPATH_URL_PREFIX + "/mapper/UserMapper.xml").getInputStream().available());
//            System.out.println(resourceLoader.getResource(ResourceUtils.CLASSPATH_URL_PREFIX + "/ch/qos/logback/core/Appender.class").getInputStream().available());
//            Enumeration<URL> urls = resourceLoader.getClassLoader().getResources("META-INF/spring.factories");
//            while (urls.hasMoreElements()) {
//                URL url = urls.nextElement();
//                if(url.getFile().contains("spring-beans")){
//                    BufferedReader br = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
//                    String line = null;
//                    System.out.println("::::::::::::::::::::::::::::META-INF/spring.factories start::::::::::::::::::::::::::::::::::::");
//                    System.out.println(url.getFile());
//                    while ((line = br.readLine()) != null) {
//                        System.out.println(line);
//                    }
//                    br.close();
//                    System.out.println("::::::::::::::::::::::::::::META-INF/spring.factories end::::::::::::::::::::::::::::::::::::");
//                    break;
//                }
//            }
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }
}



