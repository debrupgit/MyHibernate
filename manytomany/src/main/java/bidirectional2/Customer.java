package bidirectional2;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Customer 
{
	@Column(nullable=false,unique=true)
	private int C_id;
	
	@Column(nullable=false,unique=true)
	private String C_name;
	@Id
	private long C_phone;
	
	@ManyToMany
	List<Product>pd;

	public int getC_id() {
		return C_id;
	}

	public void setC_id(int c_id) {
		C_id = c_id;
	}

	public String getC_name() {
		return C_name;
	}

	public void setC_name(String c_name) {
		C_name = c_name;
	}

	public long getC_phone() {
		return C_phone;
	}

	public void setC_phone(long c_phone) {
		C_phone = c_phone;
	}

	public List<Product> getPd() {
		return pd;
	}

	public void setPd(List<Product> pd) {
		this.pd = pd;
	}
	
}
