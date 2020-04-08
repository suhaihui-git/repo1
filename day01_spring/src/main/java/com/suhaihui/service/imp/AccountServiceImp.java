package com.suhaihui.service.imp;

import com.suhaihui.dao.AccountDao;
import com.suhaihui.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class AccountServiceImp implements AccountService {

    @Autowired
    @Qualifier("accountDaoImp")
    private AccountDao accountDao = null;


    public void saveAccount() {
        accountDao.saveAccount();
    }

}
