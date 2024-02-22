package bidirectional_onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BankAc22 
{
	@Id
	private String ifsc;
	@Column(nullable=false,unique=true)
	private long account_id;
	@Column(nullable=false,unique=true)
	private String bankname;
	
	@ManyToOne
	Pancard44 pancard44;
	
	
	
	
	
	public Pancard44 getPancard44() {
		return pancard44;
	}
	public void setPancard44(Pancard44 pancard44) {
		this.pancard44 = pancard44;
	}
	public String getIfsc() 
	{
		return ifsc;
	}
	public void setIfsc(String ifsc) 
	{
		this.ifsc = ifsc;
	}
	public long getAccount_id() 
	{
		return account_id;
	}
	public void setAccount_id(long account_id) 
	{
		this.account_id = account_id;
	}
	public String getBankname() 
	{
		return bankname;
	}
	public void setBankname(String bankname) 
	{
		this.bankname = bankname;
	}
	
	
	
}
