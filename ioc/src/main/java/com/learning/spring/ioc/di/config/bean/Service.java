package com.learning.spring.ioc.di.config.bean;

/**
 * @author Huy
 * @date 2018/10/24 10:29
 */
// Service类
public class Service {
    private Dao dao;

    public String getName(String name) {
        return dao.getName(name);
    }

    public Dao getDao() {
        return dao;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }
}
