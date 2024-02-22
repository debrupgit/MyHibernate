package manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Students4 
{
	@Id
	private int sid;
	@Column(nullable=false,unique=false)
	private String sname;
	
	@Column(nullable=false,unique=true)
	private long phone;
	
	@ManyToMany
	List<Courses4> courses4s;

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

	public List<Courses4> getCourses4s() {
		return courses4s;
	}

	public void setCourses4s(List<Courses4> courses4s) {
		this.courses4s = courses4s;
	}

	
	
}
