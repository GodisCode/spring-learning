package com.learning.spring.ioc.di.lookup;

import com.learning.spring.ioc.common.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by Huy on 2018/8/23.
 */
public class LookupInjectionTest extends BaseTest {
    @Autowired
    private LookupInjection lookupInjection;

    @Test
    public void getPrototypeClass() {
        for (int i = 0; i < 3; i++) {
            lookupInjection.getPrototypeClass().print();
        }
    }
}