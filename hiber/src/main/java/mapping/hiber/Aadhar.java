package mapping.hiber;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Aadhar {
	@Id
	int aadharNum;
	String address;
	String gender;
	@OneToOne
	Person person;
	public Aadhar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aadhar(int aadharNum, String address, String gender, Person person) {
		super();
		this.aadharNum = aadharNum;
		this.address = address;
		this.gender = gender;
		this.person = person;
	}
	public int getAadharNum() {
		return aadharNum;
	}
	public void setAadharNum(int aadharNum) {
		this.aadharNum = aadharNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Aadhar [aadharNum=" + aadharNum + ", address=" + address + ", gender=" + gender + ", person=" + person
				+ "]";
	}
	
	
	
}
