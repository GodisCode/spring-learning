package com.learning.spring.ioc.di.config.bean;

/**
 * @author Huy
 * @date 2018/10/24 10:30
 */
// Controller类
public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    public void printName(String name) {
        System.out.println(service.getName(name));
    }
}
