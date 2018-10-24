package com.learning.spring.ioc.di.config.java;

import com.learning.spring.ioc.di.config.bean.ABean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 *
 * Created by Huy on 2018/10/24.
 */
@Configuration
public class FirstConfiguration {
    @Bean
    public ABean aBean() {
        return new ABean();
    }
}
