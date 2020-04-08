package com.suhaihui.service.Impl;

import com.suhaihui.service.AccountService;

/**
 * @ClassName AccountServiceImpl
 * @Description
 * @Author suhaihui
 * @Date 2020/3/27 14:14
 **/
public class AccountServiceImpl implements AccountService {
    public void testOne() {
        System.out.println("testOne方法执行了");
    }

    public void testTwo(int i) {
        System.out.println("testTwo方法执行了"+i);
    }

    public int testThree() {
        System.out.println("testThree方法执行了");
        return 0;
    }
}
