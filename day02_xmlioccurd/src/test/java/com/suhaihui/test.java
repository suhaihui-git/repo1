package com.suhaihui;

import com.suhaihui.domain.Account;
import com.suhaihui.servicce.AccountService;
import com.suhaihui.servicce.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {

    /**
     * 查询全部account
     */
    @Test
    public void findAll() {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = classPathXmlApplicationContext.getBean("accountService", AccountService.class);
        List<Account> all = accountService.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }
}
