package oneTomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pan_card3 
{
	@Id
	private String panid;
	@Column(nullable=false,unique=false)
	private String name;
	@Column(nullable=false,unique=true)
	private long phone;
	
	@OneToMany
	List<Bank_Acc>banks;

	public String getPanid() 
	{
		return panid;
	}

	public void setPanid(String panid) 
	{
		this.panid = panid;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public long getPhone() 
	{
		return phone;
	}

	public void setPhone(long phone) 
	{
		this.phone = phone;
	}

	public List<Bank_Acc> getBanks() 
	{
		return banks;
	}

	public void setBanks(List<Bank_Acc> banks) 
	{
		this.banks = banks;
	}
	
	    
	    
}
