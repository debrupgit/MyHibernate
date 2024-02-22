package manytomany;

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
		
		Students4 s1=new Students4();
		s1.setSid(1);
		s1.setSname("Debrup");
		s1.setPhone(9878674563l);
		
		Students4 s2=new Students4();
		s2.setSid(2);
		s2.setSname("soumik");
		s2.setPhone(8764567835l);
		
		Students4 s3=new Students4();
		s3.setSid(3);
		s3.setSname("Sayan");
		s3.setPhone(9889788765l);
		
		List<Students4> studlst=new ArrayList<Students4>();
		studlst.add(s1);
		studlst.add(s2);
		studlst.add(s3);
		
	
		
		Courses4 c1=new Courses4();
		c1.setCname("Developement");
		c1.setDays(30);
		c1.setTrainer("preetham");
		
		Courses4 c2=new Courses4();
		c2.setCname("Testing");
		c2.setDays(20);
		c2.setTrainer("Siddhesh");
		
		Courses4 c3=new Courses4();
		c3.setCname("Devops");
		c3.setDays(40);
		c3.setTrainer("Akshay");
		
		List<Courses4> courslst=new ArrayList<Courses4>();
		courslst.add(c1);
		courslst.add(c2);
		courslst.add(c3);
		
		s1.setCourses4s(courslst);
		s2.setCourses4s(courslst);
		s3.setCourses4s(courslst);
		
		c1.setStudents4s(studlst);
		c2.setStudents4s(studlst);
		c3.setStudents4s(studlst);
		
		
		entityTransaction.begin();
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityManager.persist(c3);
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(s3);
		entityTransaction.commit();
		
		System.out.println("many to many mapping done");
		
		
	}
}
