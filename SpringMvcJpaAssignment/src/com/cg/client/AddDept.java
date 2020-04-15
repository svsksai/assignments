package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.entity.Dept;

public class AddDept {

	public static void main(String args[]) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-CRUD");
EntityManager em=emf.createEntityManager();
		
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Dept dept = new Dept();
		dept.setDeptName("hr");
		
		em.persist(dept);
		tx.commit();
		em.close();
		emf.close();
	}
}
