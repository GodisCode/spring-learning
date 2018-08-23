package com.learning.spring.ioc.di.lookup;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Huy on 2018/8/23.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeClass {
    public void print() {
        System.out.println("this prototypeClass = " + this);
    }
}
