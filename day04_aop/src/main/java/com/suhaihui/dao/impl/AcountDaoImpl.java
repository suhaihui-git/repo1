package com.suhaihui.dao.impl;

import com.suhaihui.dao.AccountDao;
import com.suhaihui.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
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

    public Account findUserByName(String name) {
        String sql = "select * from account where name = ?";

        try {
            List<Account> accounts = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Account>(Account.class), name);
            if (accounts ==null || accounts.size()==0){
                return null;
            }
            if (accounts.size()>1){
                throw new RuntimeException("多个用户");
            }
            return accounts.get(0);
        } catch (DataAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
