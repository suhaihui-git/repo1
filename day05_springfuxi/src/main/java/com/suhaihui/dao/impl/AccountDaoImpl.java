package com.suhaihui.dao.impl;

import com.suhaihui.dao.AccountDao;
import com.suhaihui.domain.Account;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName AccountDaoImpl
 * @Description
 * @Author suhaihui
 * @Date 2020/3/10 15:58
 **/

@Component("accountDao")  //把当前类创建一个对象存入spring容器 属性value:指定bean的id,不传值默认类名首字母改小写
//@Repository("AccountDao")
public class AccountDaoImpl implements AccountDao {
    public List<Account> findAll() {
        return null;
    }
}
