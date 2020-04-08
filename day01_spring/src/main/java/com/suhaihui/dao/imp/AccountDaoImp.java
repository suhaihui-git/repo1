package com.suhaihui.dao.imp;

import com.suhaihui.dao.AccountDao;
import org.springframework.stereotype.Component;


@Component("accountDaoImp")
public class AccountDaoImp implements AccountDao {

    public void saveAccount() {
        System.out.println("用户保存了11111");
    }
}
