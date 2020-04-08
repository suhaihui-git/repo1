package com.suhaihui.servicce;

import com.suhaihui.domain.Account;

import java.util.List;

public interface AccountService {

    /**
     * 查询所有方法
     * @return
     */
    List<Account> findAll();

    /**
     * 根据用户名查找用户信息
     * @param name
     * @return
     */
    Account findUserByName(String name);

    /**
     * 转账方法
     * @param name1  转出用户名
     * @param name2  转入用户名
     * @param money  转账money
     */
    void tranfer(String name1,String name2,Double money);
}
