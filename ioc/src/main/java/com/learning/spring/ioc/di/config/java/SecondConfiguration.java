package com.learning.spring.ioc.di.config.java;

import com.learning.spring.ioc.di.config.bean.ABean;
import com.learning.spring.ioc.di.config.bean.BBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Huy
 * @date 2018/10/24 9:59
 */
@Configuration
@Import({FirstConfiguration.class})
public class SecondConfiguration {
    /*@Bean
    public BBean bBean(ABean aBean) {
        BBean bBean = new BBean();
        bBean.setaBea(aBean);
        return bBean;
    }*/
}
