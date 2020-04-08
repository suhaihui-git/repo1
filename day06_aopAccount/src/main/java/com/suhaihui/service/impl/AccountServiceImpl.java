package com.suhaihui.service.impl;

import com.suhaihui.dao.AccountDao;
import com.suhaihui.domain.Account;
import com.suhaihui.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName AccountServiceImpl
 * @Description
 * @Author suhaihui
 * @Date 2020/3/11 17:04
 **/

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;


    public Account selectOneById(int accountId) {
        return accountDao.selectOneById(accountId);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }



    public void transfer(int id1, int id2, float money) {
        Account account1 = accountDao.selectOneById(id1);
        Account account2 = accountDao.selectOneById(id2);
        account1.setMoney(account1.getMoney()-money);
        account2.setMoney(account2.getMoney()+money);
        accountDao.updateAccount(account1);
        accountDao.updateAccount(account2);
    }

    public void testOne() {
        System.out.println("执行了testOne方法");
    }

}
