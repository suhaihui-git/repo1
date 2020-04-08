package com.suhaihui.test;

import com.suhaihui.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @ClassName aoptest
 * @Description
 * @Author suhaihui
 * @Date 2020/3/27 14:24
 **/



public class aoptest {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
        AccountService servcie = (AccountService) app.getBean("accountService");
        servcie.testOne();
    }
}
