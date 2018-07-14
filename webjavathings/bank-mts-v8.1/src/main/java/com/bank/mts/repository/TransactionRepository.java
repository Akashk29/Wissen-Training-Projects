package com.bank.mts.repository;

import java.util.Date;

import com.bank.mts.model.Account;
import com.bank.mts.model.Transaction;

public interface TransactionRepository {

	void retrieve(String accountNum , Date fromDate , Date toDate);

	void enter(Transaction transaction);
	
}
