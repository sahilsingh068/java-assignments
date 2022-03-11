package com.jpql;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("jpqlex");
		EntityManager entity=factory.createEntityManager();
		entity.getTransaction().begin();
		
//		 Employee e=new Employee(1000,"sahil",12000,"jmu");
//		 Employee e1=new Employee(1001,"vicky",13000,"jpr");
//		 Employee e2= new Employee(1002, "ravi", 11000, "mum"); 
//		 Employee e3= new Employee(1003, "rivanshu", 14000, "nbd");
//		 entity.persist(e);
//		 entity.persist(e1); 
//		 entity.persist(e2);
//		 entity.persist(e3);
		 
		
		  TypedQuery<Employee> tq=entity.createQuery("select e from Employee e",Employee.class);
		  List<Employee>li=tq.getResultList();
		  for(Employee s:li) {
		  System.out.println(s.getEmpId());
		  System.out.println(s.getEmpName());
		  System.out.println(s.getEmpSal()); 
		  }
		 
		
//		 UPDATE THE TABLE
//		  Query result=entity. createQuery("update Employee set empSal=empSal+5000 where empSal>1000");
//		  result.executeUpdate();
		
		
		// DELETE THE VALUES IN THE TABLE
//		Query result=entity.createQuery("delete from Employee where empSal>13000");
//		result.executeUpdate();
		
		// SELECT 
		Query result=entity.createQuery("select MAX(e.empSal) from Employee e");
		int maxSal=(int) result.getSingleResult();
		
		
		
		entity.getTransaction().commit();
		entity.close();
		factory.close();
	}

}
