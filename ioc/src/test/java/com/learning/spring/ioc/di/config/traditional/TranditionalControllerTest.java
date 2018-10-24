package com.learning.spring.ioc.di.config.traditional;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Huy
 * @date 2018/10/24 10:38
 */
public class TranditionalControllerTest {

    @Test
    public void printName() {
        new TranditionalController().printName();
    }
}