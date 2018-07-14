package com.bank.mts.repository;

import com.bank.mts.model.Account;
import org.apache.log4j.Logger;

public class JdbcAccountRepository implements AccountRepository {

	private static Logger logger = Logger.getLogger("mts");
	
	public JdbcAccountRepository() {
		
		logger.info("Jdbc account repository created.");
	}
	
	public Account load(String num) {
		logger.info("loading account " + num);
		return null;
	}

	public void update(String num) {
		logger.info("updating account " + num);
		
	}

}
