package com.learning.spring.ioc.di.config.bean;

/**
 * @author Huy
 * @date 2018/10/24 9:56
 */
public class BBean {
    private ABean aBea;

    public void print() {
        System.out.println("BBean");
    }

    public ABean getaBea() {
        return aBea;
    }

    public void setaBea(ABean aBea) {
        this.aBea = aBea;
    }
}
