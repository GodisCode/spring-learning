package com.learning.spring.ioc.di.config.java;

import com.learning.spring.ioc.di.config.bean.Controller;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * @author Huy
 * @date 2018/10/24 10:43
 */
public class JavaConfigTest {
    @Test
    public void testPrintName() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
        Controller controller = ac.getBean(Controller.class);
        controller.printName("Java Config Bean Test");
    }
}