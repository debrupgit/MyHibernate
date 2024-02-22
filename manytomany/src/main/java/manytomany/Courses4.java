package manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Courses4 
{
	@Id
	private String cname;
	
	@Column(nullable=false,unique=true)
	private int days;
	
	@Column(nullable=false,unique=true)
	private String trainer;
	
	@ManyToMany
	List<Students4>students4s;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public List<Students4> getStudents4s() {
		return students4s;
	}

	public void setStudents4s(List<Students4> students4s) {
		this.students4s = students4s;
	}

	
	
}
