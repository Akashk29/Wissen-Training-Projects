package com.bank.mts.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.bank.mts.model.Transaction;

public class JpaTransactionRepository implements TransactionRepository{

	
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public void enter(Transaction transaction) {
		em.persist(transaction);
		
	}

	@Override
	public void retrieve(String accountID, Date fromDate, Date toDate) {
		
		String hql = "FROM transaction T where t.accountNum = ? and "
				+ "t.date BETWEEN :? AND :?";
		Query query = em.createQuery(hql);
		
		query.setParameter(0, accountID);
		query.setParameter(1, fromDate);
		query.setParameter(2, toDate);
		
		List<Transaction> result =  query.getResultList();
		
		for(Transaction t :result) {
			
			System.out.println(t.toString());
		}
		

	}

	
	
}
