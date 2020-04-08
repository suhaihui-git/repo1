package com.suhaihui;

import com.suhaihui.domain.Account;
import com.suhaihui.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName test
 * @Description
 * @Author suhaihui
 * @Date 2020/3/11 17:15
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class test {
    @Autowired
    private AccountService accountService =null;

    @Test
    public void test1(){
        accountService.transfer(1,2,100f);
    }
}
