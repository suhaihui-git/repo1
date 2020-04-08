package com.suhaihui.dao.impl;

import com.suhaihui.dao.AccountDao;
import com.suhaihui.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public class AcountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Account> findAll() {
        String sql = "select * from account";
        List<Account> accounts = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Account>(Account.class));
        return accounts;
    }
}
