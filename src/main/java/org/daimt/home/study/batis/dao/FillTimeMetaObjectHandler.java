package org.daimt.home.study.batis.dao;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 自动填充添加，更新时间处理器
 */
@Slf4j
@Component
public class FillTimeMetaObjectHandler implements MetaObjectHandler {

    //插入时的填充策略
    @Override
    public void insertFill(MetaObject metaObject) {
        log.debug("start insert fill......");
        this.setFieldValByName("createTime",new Date(),metaObject);
        //MetaObject[反射对象类]是Mybatis的工具类，通过MetaObject获取和设置对象的属性值。
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }

    //更新时的填充策略
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill.....");
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }
}


