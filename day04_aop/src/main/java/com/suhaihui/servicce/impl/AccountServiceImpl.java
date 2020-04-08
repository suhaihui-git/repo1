package com.suhaihui.servicce.impl;

import com.suhaihui.dao.AccountDao;
import com.suhaihui.domain.Account;
import com.suhaihui.servicce.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public Account findUserByName(String name) {
        return accountDao.findUserByName(name);
    }

    public void tranfer(String name1, String name2, Double money) {

    }


}
