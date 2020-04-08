package com.suhaihui.dao.imp;

import com.suhaihui.dao.AccountDao;
import org.springframework.stereotype.Component;


@Component("accountDaoImp2")
public class AccountDaoImp2 implements AccountDao {

    public void saveAccount() {
        System.out.println("用户保存了22222222");
    }
}
