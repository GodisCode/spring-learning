package com.learning.spring.ioc.di.replacer;

import com.learning.spring.ioc.common.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ReplacerAspectTest extends BaseTest {
    @Autowired
    private Boss1 boss1;

    @Test
    public void replaceMethod() {
        boss1.print();
        /**
         * 输出结果：
         * ReplacerAspect.replaceMethod()
         */
    }
}