package com.learning.spring.ioc.di.lookup;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Huy on 2018/8/23.
 */
@RunWith(SpringRunner.class)
// 在Junit测试中，加载非resources和test-resources目录的配置文件，只能file指定，不能用classpath
@ContextConfiguration({"file:src/main/java/com/learning/spring/ioc/di/lookup/lookup.xml"})
// @ContextConfiguration({"classpath:lookup.xml"})
public class XmlLookupInjectionTest {
    @Autowired
    private LookupInjectionImpl lookupInjectionImpl;

    @Test
    public void getPrototypeClass() {
        for (int i = 0; i < 3; i++) {
            lookupInjectionImpl.getPrototypeClass().print();
        }
    }
}
