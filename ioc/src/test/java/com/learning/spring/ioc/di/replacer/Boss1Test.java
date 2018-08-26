package com.learning.spring.ioc.di.replacer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration({"file:src/main/java/com/learning/spring/ioc/di/replacer/replacer.xml"})
public class Boss1Test {
    @Autowired
    private Boss1 boss1;

    @Test
    public void print() {
        boss1.print();
    }
}