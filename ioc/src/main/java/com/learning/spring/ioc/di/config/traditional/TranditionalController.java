package com.learning.spring.ioc.di.config.traditional;

import com.learning.spring.ioc.di.config.bean.Dao;
import com.learning.spring.ioc.di.config.bean.Service;

/**
 * @author Huy
 * @date 2018/10/24 10:30
 */
// JavaSE调用方式
public class TranditionalController {
    private Service service;

    public TranditionalController() {
        Service service = new Service();
        service.setDao(new Dao());
        this.service = service;
    }

    public void printName() {
        System.out.println(service.getName("JavaSE Object Test"));
    }
}
