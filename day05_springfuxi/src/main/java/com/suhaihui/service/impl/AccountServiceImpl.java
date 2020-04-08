package com.suhaihui.service.impl;

import com.suhaihui.dao.AccountDao;
import com.suhaihui.domain.Account;
import com.suhaihui.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ClassName AccountServiceImpl
 * @Description
 * @Author suhaihui
 * @Date 2020/3/10 15:54
 **/
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao AccountDao;

    public List<Account> findAll() {
        return AccountDao.findAll();
    }
}
