package com.suhaihui.service;

import com.suhaihui.domain.Account;

public interface AccountService {

    public Account selectOneById(int accountId);

    public void updateAccount(Account account);

    void transfer(int id1, int id2, float money);

    public void testOne();
}
