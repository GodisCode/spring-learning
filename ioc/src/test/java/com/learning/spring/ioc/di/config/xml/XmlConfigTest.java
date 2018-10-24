package com.learning.spring.ioc.di.config.xml;

import com.learning.spring.ioc.di.config.bean.Controller;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Huy
 * @date 2018/10/24 10:49
 */
public class XmlConfigTest {
    @Test
    public void testPrintName() {
        ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/java/com/learning/spring/ioc/di/config/xml/Bean.xml");
        Controller controller = ac.getBean(Controller.class);
        controller.printName("Xml Config Bean Test");
    }
}
