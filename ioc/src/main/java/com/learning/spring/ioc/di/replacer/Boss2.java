package com.learning.spring.ioc.di.replacer;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 利用MethodReplacer接口实现方法替换
 */
public class Boss2 implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] args) throws Throwable {
        System.out.println("Boss2.print()");
        return null;
    }
}
