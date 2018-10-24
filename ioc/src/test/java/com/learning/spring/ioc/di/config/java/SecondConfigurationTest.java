package com.learning.spring.ioc.di.config.java;

import com.learning.spring.ioc.di.config.bean.ABean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Huy
 * @date 2018/10/24 10:09
 */
public class SecondConfigurationTest {
    @Test
    public void testImportAnnotation() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SecondConfiguration.class);
        ABean aBean = ac.getBean(ABean.class);
        aBean.print();
    }
}