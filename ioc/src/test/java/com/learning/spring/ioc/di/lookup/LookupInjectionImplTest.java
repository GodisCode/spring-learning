package com.learning.spring.ioc.di.lookup;

import com.learning.spring.ioc.common.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Huy on 2018/8/23.
 */
public class LookupInjectionImplTest extends BaseTest {
    @Autowired
    LookupInjectionImpl lookupInjectionImpl;

    @Test
    public void getPrototypeClass() {
        for (int i = 0; i < 3; i++) {
            lookupInjectionImpl.getPrototypeClass().print();
        }
    }
}