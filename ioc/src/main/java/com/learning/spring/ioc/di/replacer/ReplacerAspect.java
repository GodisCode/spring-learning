package com.learning.spring.ioc.di.replacer;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 利用AOP的环绕增强实现方法替换
 */
@Aspect
@Component
public class ReplacerAspect {
    @Around("execution(* com.learning.spring.ioc.di.replacer.Boss1.print())")
    public Object replaceMethod() {
        System.out.println("ReplacerAspect.replaceMethod()");
        return null;
    }
}
