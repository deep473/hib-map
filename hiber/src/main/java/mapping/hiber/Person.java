package mapping.hiber;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	int id;
	String name;
	int mobile;
	@OneToOne
	Aadhar aadhar;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, int mobile, Aadhar aadhar) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.aadhar = aadhar;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public Aadhar getAadhar() {
		return aadhar;
	}
	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobile=" + mobile + ", aadhar=" + aadhar + "]";
	}
	
	
}
