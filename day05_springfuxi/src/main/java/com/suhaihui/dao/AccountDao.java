package com.suhaihui.dao;

import com.suhaihui.domain.Account;

import java.util.List;

public interface AccountDao {

    List<Account> findAll();
}
