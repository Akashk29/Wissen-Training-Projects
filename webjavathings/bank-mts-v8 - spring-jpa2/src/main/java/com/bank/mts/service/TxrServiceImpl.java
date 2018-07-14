package com.bank.mts.service;

import java.util.Date;

import org.springframework.transaction.annotation.Transactional;

import com.bank.mts.model.Account;
import com.bank.mts.model.Transaction;
import com.bank.mts.repository.AccountRepository;
import com.bank.mts.repository.TransactionRepository;

public class TxrServiceImpl implements TxrService {

	private AccountRepository accountRepository;
	private TransactionRepository transactionRepository;

	public TxrServiceImpl() {
	}

	public void setAccountRepository(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	public void setTransactionRepository(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}

	@Transactional
	public void txr(double amount, String fromAccNum, String toAccNum) {
	Account fromAccount = accountRepository.load(fromAccNum);
			Account toAccount = accountRepository.load(toAccNum);

			fromAccount.setBalance(fromAccount.getBalance() - amount);
			toAccount.setBalance(toAccount.getBalance() + amount);

			accountRepository.update(fromAccount);
			boolean b = false;
			if (b)
				throw new RuntimeException();
			accountRepository.update(toAccount);
			
			
			Transaction transaction1 = new Transaction(fromAccNum, new Date(),
					"Debit", amount, fromAccount.getBalance(), "Transfering money..");
			
			Transaction transaction2 = new Transaction(toAccNum, new Date(),
					"Credit", amount, toAccount.getBalance(), "Receiving money..");
			
			transactionRepository.enter(transaction1);
			transactionRepository.enter(transaction2);
			
			
	}

	

}
