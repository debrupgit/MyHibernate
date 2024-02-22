package unidirectional;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Students5 
{
	@Id
	private int sid;
	@Column(nullable=false,unique=false)
	private String sname;
	
	@Column(nullable=false,unique=true)
	private long phone;
	
	@ManyToMany
	List<Course5> co5;

	

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public List<Course5> getCo5() {
		return co5;
	}

	public void setCo5(List<Course5> co5) {
		this.co5 = co5;
	}
	
	

	
}
