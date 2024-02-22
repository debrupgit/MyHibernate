package unidirectional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class controller
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Students5 st1=new Students5();
		
		st1.setSid(1);
		st1.setSname("Debrup");
		st1.setPhone(9878698757l);
		
		Students5 st2=new Students5();
		
		st2.setSid(2);
		st2.setSname("Soumik");
		st2.setPhone(9870099757l);
		
		Students5 st3=new Students5();
		
		st3.setSid(3);
		st3.setSname("Pabitra");
		st3.setPhone(9878554457l);
		
	
		
		
		Course5 co1=new Course5();
		co1.setCname("Testing");
		co1.setDays(30);
		co1.setTrainer("preetham");
		
		Course5 co2=new Course5();
		co2.setCname("Devops");
		co2.setDays(45);
		co2.setTrainer("Akshay");
		
		Course5 co3=new Course5();
		co3.setCname("React");
		co3.setDays(35);
		co3.setTrainer("Rahul");
		
		
		List<Course5> courslst=new ArrayList<Course5>();
		courslst.add(co1);
		courslst.add(co2);
		courslst.add(co3);
		
		//mapping relationship
		st1.setCo5(courslst);
		st2.setCo5(courslst);
		st3.setCo5(courslst);
		
		
		
		
		
		entityTransaction.begin();
		entityManager.persist(st1);
		entityManager.persist(st2);
		entityManager.persist(st3);
		
		entityManager.persist(co1);
		entityManager.persist(co2);
		entityManager.persist(co3);
		entityTransaction.commit();
		
		
		
		
	
		
		System.out.println("many to many unidirectional");
		
	}
}
