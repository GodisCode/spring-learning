package com.learning.spring.ioc.lifecycle;

import com.learning.spring.ioc.common.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Huy on 2018/8/21.
 */
// @RunWith(SpringRunner.class)
// @ContextConfiguration("file:src/main/java/com/learning/spring/ioc/lifecycle/car-config.xml")
public class LifeCycleTest extends BaseTest {
    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void testLifeCycle() {
        Car car = (Car) applicationContext.getBean(Car.CAR_BEAN_NAME);
    }
}
