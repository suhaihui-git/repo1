package com.suhaihui;

import com.suhaihui.config.SpringConfiguration;
import com.suhaihui.domain.Account;
import com.suhaihui.servicce.AccountService;
import com.suhaihui.servicce.impl.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class test {
    @Autowired
    private AccountService accountService=null;

    /**
     * 查询全部account
     */
    @Test
    public void findAll() {
        List<Account> all = accountService.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }
}
