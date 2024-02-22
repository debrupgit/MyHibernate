package bidirectional_onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pancard44 
{
	@Id
	private String panid;
	@Column(nullable=false,unique=false)
	private String name;
	@Column(nullable=false,unique=true)
	private long phone;
	
	@OneToMany
	List<BankAc22>ba22;

	



	

	public List<BankAc22> getBa22() {
		return ba22;
	}

	public void setBa22(List<BankAc22> ba22) {
		this.ba22 = ba22;
	}

	public String getPanid() {
		return panid;
	}

	public void setPanid(String panid) {
		this.panid = panid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	
	
	
}
