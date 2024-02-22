package bidirectional2;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product 	
{
	@Id
	private int p_id;
	@Column(nullable=false,unique=true)
	private String p_name;
	@Column(nullable=false,unique=true)
	private String p_mfg;
	
	@ManyToMany
	List<Customer>cm;

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_mfg() {
		return p_mfg;
	}

	public void setP_mfg(String p_mfg) {
		this.p_mfg = p_mfg;
	}

	public List<Customer> getCm() {
		return cm;
	}

	public void setCm(List<Customer> cm) {
		this.cm = cm;
	}
}
