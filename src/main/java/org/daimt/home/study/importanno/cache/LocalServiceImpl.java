package org.daimt.home.study.importanno.cache;

public class LocalServiceImpl implements CacheService {
    @Override
    public void setData(String key) {
        System.out.println("本地存储数据成功，key="+key);
    }
}
