package mapping.hiber;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	int cId;
	String cName;
	@ManyToMany
	List<Student> studentList;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int cId, String cName, List<Student> studentList) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.studentList = studentList;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", studentList=" + studentList + "]";
	}
	
}
