package com.learning.spring.ioc.di.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 单例Bean注入多例Bean时，多例Bean一直都是同一个对象
 *
 * Created by Huy on 2018/8/23.
 */
@Component
public class SingletonClass {
    @Autowired
    private PrototypeClass prototypeClass;

    public void print() {
        System.out.println("prototypeClass = " + prototypeClass);
    }
}
