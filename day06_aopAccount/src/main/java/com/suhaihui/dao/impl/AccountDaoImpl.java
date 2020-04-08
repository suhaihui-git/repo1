package com.suhaihui.dao.impl;

import com.suhaihui.dao.AccountDao;
import com.suhaihui.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @ClassName AccountDaoImpl
 * @Description
 * @Author suhaihui
 * @Date 2020/3/11 17:11
 **/

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Account selectOneById(int accountId) {
        System.out.println("执行了查询一个方法");
        String sql = "select * from account where id= ?";
        try {
            Account account1 = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Account>(Account.class), accountId);
            return account1;
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateAccount(Account account) {
        System.out.println("更新方法已执行");
        String sql = "update account set money= ? where id = ?";
        jdbcTemplate.update(sql, account.getMoney(), account.getId());
    }

//    @Override
//    public void transer() {
//        System.out.println("转账方法执行了");
//        String sql= "update account set money = money - 100 where id = ?";
//        String sql2= "update account set money = money + 100 where id = ?";
//        jdbcTemplate.update(sql, 1);
//        jdbcTemplate.update(sql2, 2);
//
//    }


}
