package com.suhaihui.ui;

import com.suhaihui.dao.AccountDao;
import com.suhaihui.service.AccountService;
import com.suhaihui.service.imp.AccountServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Client {
    public static void main(String[] args) {
        //1、获取核心容器对
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2、根据id获取对象
        AccountServiceImp accountService = (AccountServiceImp) ac.getBean("accountServiceImp");
        //方式二
        //AccountService accountService1 = ac.getBean("accountService", AccountService.class);
        accountService.saveAccount();
    }
}
