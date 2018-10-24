package com.learning.spring.ioc.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Bean后处理器之BeanPostProcessor示例
 *
 * Created by Huy on 2018/8/21.
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (Car.CAR_BEAN_NAME.equals(beanName)) {
            Car car = (Car) bean;
            if (car.getColor() == null) {
                System.out.println("BeanPostProcessor.postProcessBeforeInitialization()，color为空，设置为默认黑色");
                car.setColor("黑色");
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (Car.CAR_BEAN_NAME.equals(beanName)) {
            Car car = (Car) bean;
            if (car.getMaxSpeed() >= 200) {
                System.out.println("BeanPostProcessor.postProcessAfterInitialization()，将maxSpeed调整为200");
                car.setMaxSpeed(200);
            }
            System.out.println("最终的Car Bean是：" + car.toString());
        }
        return bean;
    }
}
