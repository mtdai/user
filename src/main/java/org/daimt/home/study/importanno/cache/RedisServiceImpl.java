package org.daimt.home.study.importanno.cache;


public class RedisServiceImpl implements CacheService {

    @Override
    public void setData(String key) {
        System.out.println("redis存储数据成功 key= " + key);
    }
}
