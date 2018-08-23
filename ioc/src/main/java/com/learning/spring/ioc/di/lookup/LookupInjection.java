package com.learning.spring.ioc.di.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * 直接接口lookup注入
 *
 * Created by Huy on 2018/8/23.
 */
@Component
public interface LookupInjection {
    /**
     * 标注了@Lookup的方法所在类会在运行时自动生成子类，所以不用提供实现类也可以。
     *
     * 但一般情况下我们都要写实现类，此时Lookup方法可以直接这样写：
     * <pre>
     *     <code>
     *         public PrototypeClass getPrototypeClass() {
     *             return null;
     *         }
     *     </code>
     * </pre>
     * 如：{@link LookupInjectionImpl#getPrototypeClass()}
     *
     * @return
     */
    @Lookup
    PrototypeClass getPrototypeClass();
}
