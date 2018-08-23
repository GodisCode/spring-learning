package com.learning.spring.ioc.di.lookup;

import com.learning.spring.ioc.common.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by Huy on 2018/8/23.
 */
public class SingletonClassTest extends BaseTest {
    @Autowired
    private SingletonClass singletonClass;

    @Test
    public void print() {
        for (int i = 0; i < 3; i++) {
            singletonClass.print();
        }

        /**
         * 输出：
         * prototypeClass = com.learning.spring.ioc.di.lookup.PrototypeClass@18230356
         * prototypeClass = com.learning.spring.ioc.di.lookup.PrototypeClass@18230356
         * prototypeClass = com.learning.spring.ioc.di.lookup.PrototypeClass@18230356
         */
    }
}