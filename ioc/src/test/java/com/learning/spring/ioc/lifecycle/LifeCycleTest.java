package com.learning.spring.ioc.lifecycle;

import com.learning.spring.ioc.common.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * Created by Huy on 2018/8/21.
 */

public class LifeCycleTest extends BaseTest {
    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void testLifeCycle() {
        Car car = (Car) applicationContext.getBean(Car.CAR_BEAN_NAME);
    }
}
