package com.learning.spring.ioc.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Bean自身的方法和Bean级生命周期接口方法示例
 *
 * Created by Huy on 2018/8/21.
 */
@Component
public class Car implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean, ApplicationContextAware {
    public static final String CAR_BEAN_NAME = "car";

    private String brand;
    private String color;
    private int maxSpeed;

    private BeanFactory beanFactory;
    private String beanName;

    public Car() {
        System.out.println("调用Car()构造方法");
    }

    public void setBrand(String brand) {
        System.out.println("调用setBrand()设置属性");
        this.brand = brand;
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("调用BeanNameAwared的setBeanName(), BeanName为" + beanName);
        this.beanName = beanName;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactoryAware的setBeanFactory()");
        this.beanFactory = beanFactory;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("调用ApplicationContextAware的setApplicationContext()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用InitializingBean的afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("调用DisposableBean的destroy()");
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("调用init-method，将maxSpeed设置为240");
        this.maxSpeed = 240;
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("调用destroy-method");
    }

    public void introduce() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
