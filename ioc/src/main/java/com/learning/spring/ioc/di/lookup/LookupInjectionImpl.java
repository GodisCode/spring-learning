package com.learning.spring.ioc.di.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * Created by Huy on 2018/8/23.
 */
@Component
public class LookupInjectionImpl {
    @Lookup
    public PrototypeClass getPrototypeClass() {
        // 该方法会被Spring运行时重写，所以返回值不重要，直接返回null即可。
        return null;
    }
}
