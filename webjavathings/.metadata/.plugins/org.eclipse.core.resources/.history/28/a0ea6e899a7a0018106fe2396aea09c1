package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Employee;

public class DAO_Ex {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Nag");

		// using JPA API
		// ----------------------------------------

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.persist(employee);

		em.getTransaction().commit();
		em.close();
		emf.close();

		// ----------------------------------------

	}

}
