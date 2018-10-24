package com.learning.spring.ioc.di.config.java;

import com.learning.spring.ioc.di.config.bean.Controller;
import com.learning.spring.ioc.di.config.bean.Dao;
import com.learning.spring.ioc.di.config.bean.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 *
 * @author Huy
 * @date 2018/10/24 10:40
 */
// IoC JavaConfig配置方式
@Configuration
public class JavaConfig {
    @Bean
    public Dao dao() {
        return new Dao();
    }

    @Bean
    public Service service() {
        Service service = new Service();
        service.setDao(dao());
        return service;
    }

    @Bean
    public Controller controller() {
        return new Controller(service());
    }
}
