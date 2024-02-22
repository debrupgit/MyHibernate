package bidirectional_onetomany;

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
		
		Pancard44 pa4=new Pancard44();
		pa4.setName("Avishek");
		pa4.setPanid("HHILP0098");
		pa4.setPhone(9876456784l);
		
		BankAc22 ac2=new BankAc22();
		
		ac2.setAccount_id(7755648975l);
		ac2.setBankname("ICICI");
		ac2.setIfsc("2024ICIC");
		
		BankAc22 ac23=new BankAc22();
		ac23.setAccount_id(7733448975l);
		ac23.setBankname("SBI");
		ac23.setIfsc("2024SBIG");
		
		BankAc22 ac24=new BankAc22();
		ac24.setAccount_id(7221148975l);
		ac24.setBankname("UBI");
		ac24.setIfsc("2024UBIW");
		
		 List<BankAc22> listofbanks= new ArrayList<BankAc22>();
		 listofbanks.add(ac2);
		 listofbanks.add(ac23);
		 listofbanks.add(ac24);
		 
		 //one to many
		 pa4.setBa22(listofbanks);
		 
		 //many to one
		 ac2.setPancard44(pa4);
		 ac23.setPancard44(pa4);
		 ac24.setPancard44(pa4);
		
		 entityTransaction.begin();
		 entityManager.persist(ac2);
		 entityManager.persist(ac23);
		 entityManager.persist(ac24);
		 entityManager.persist(pa4);
		 entityTransaction.commit();
		
		 
		
		 
		 
		 
		 
		
		 
		 System.out.println("onetomany bidirectional");
		
		
	}
}
