package oneTomany;

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
		
		Pan_card3 pc=new Pan_card3();
		pc.setName("Sayan");
		pc.setPanid("SAYAN44T53");
		pc.setPhone(9988774647l);
		
		
		Bank_Acc ba=new Bank_Acc();
		ba.setAccount_id(6574829833l);
		ba.setBankname("Bank of India");
		ba.setIfsc("IB202488");
		
		Bank_Acc ba1=new Bank_Acc();
		ba1.setAccount_id(6574829829l);
		ba1.setBankname("RBI");
		ba1.setIfsc("RB202455");
		
		Bank_Acc ba2=new Bank_Acc();
		ba2.setAccount_id(6574865543l);
		ba2.setBankname("PNB");
		ba2.setIfsc("PNB202499");
		
		List<Bank_Acc> listofbanks=new ArrayList<Bank_Acc>();
		
		listofbanks.add(ba);
		listofbanks.add(ba1);
		listofbanks.add(ba2);
		
		pc.setBanks(listofbanks);
		
		entityTransaction.begin();
		entityManager.persist(pc);
		entityManager.persist(ba);
		entityManager.persist(ba1);
		entityManager.persist(ba2);
		entityTransaction.commit();
		
		System.out.println("one to many");
		
		
		
	}
}
