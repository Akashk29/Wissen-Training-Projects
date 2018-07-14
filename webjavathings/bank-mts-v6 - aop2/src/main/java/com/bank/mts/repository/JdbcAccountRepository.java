package com.bank.mts.repository;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bank.mts.model.Account;
import com.bank.mts.model.AccountType;

public class JdbcAccountRepository implements AccountRepository {

	private static Logger logger = Logger.getLogger("mts");

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcAccountRepository(DataSource dataSource) {
		logger.info("JdbcAccountRepository instance created");
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Account load(String num) {
		logger.info("loading account : " + num);
		String sql = "select * from my_bank.ACCOUNTS where num = ?";
		return jdbcTemplate.queryForObject(sql, (rs,rowNum)-> {
			
		Account account = new Account()	;
		account.setNum(rs.getString(1));
		account.setHolderName(rs.getString(2));
		account.setBalance(rs.getDouble(3));
		account.setType(AccountType.valueOf(rs.getString(4)));
		return account;
			
		} , num);
	}

	public void update(Account account) {
		logger.info("updating an account");
	}

}
