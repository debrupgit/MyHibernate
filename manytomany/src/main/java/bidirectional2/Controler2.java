package bidirectional2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controler2 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Product p1=new Product();
		p1.setP_id(1);
		p1.setP_name("Coffee cup");
		p1.setP_mfg("12/02/2022");
		
		Product p2=new Product();
		p2.setP_id(2);
		p2.setP_name("Shoes");
		p2.setP_mfg("13/02/2022");
		
		Product p3=new Product();
		p3.setP_id(3);
		p3.setP_name("TV");
		p3.setP_mfg("14/02/2022");
		
		List<Product>pdlst=new ArrayList<Product>();
		pdlst.add(p1);
		pdlst.add(p2);
		pdlst.add(p3);
		
		Customer c1=new Customer();
		c1.setC_id(1);
		c1.setC_name("Debrup");
		c1.setC_phone(9878756644l);
		
		Customer c2=new Customer();
		c2.setC_id(2);
		c2.setC_name("Soumik");
		c2.setC_phone(8775678974l);
		
		Customer c3=new Customer();
		c3.setC_id(3);
		c3.setC_name("Sayan");
		c3.setC_phone(8799888974l);
		
		List<Customer>cstlst=new ArrayList<Customer>();
		cstlst.add(c1);
		cstlst.add(c2);
		cstlst.add(c3);
		
		//mapping
		
		p1.setCm(cstlst);
		p2.setCm(cstlst);
		p3.setCm(cstlst);
		
		c1.setPd(pdlst);
		c2.setPd(pdlst);
		c3.setPd(pdlst);
		
		entityTransaction.begin();
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityManager.persist(c3);
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		entityTransaction.commit();
		
		
		
	}
}
