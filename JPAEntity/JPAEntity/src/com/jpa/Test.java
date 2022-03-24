package com.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpademo");
		EntityManager entity=emf.createEntityManager();
		entity.getTransaction().begin();
		
		Student s1=new Student();
		s1.setStId(101);
		s1.setStName("sahil");
		s1.setStAdd("jammu");
		entity.persist(s1);
		
		Student s2=new Student();
		s2.setStId(102);
		s2.setStName("soma");
		s2.setStAdd("pune");
		entity.persist(s2);
		
		
		Student s3=new Student();
		s3.setStId(103);
		s3.setStName("satya");
		s3.setStAdd("hyd");
		entity.persist(s3);
		
		entity.getTransaction().commit();
		
		emf.close();
		entity.close();
	}

}
