package Studentpack;
import org.springframework.stereotype.Component;


@Component("Student1") 
public class Student {
	private String studentId;
	private String studentName;
	private Address address;
	private Chair chair;
	
	public Student() {
		super();
		}
	
	public Student(Address address,Chair chair) {
		this.address = address;
		this.chair = chair;
	
		}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Chair getChair() {
		return chair;
	}

	public void setChair(Chair chair) {
		this.chair = chair;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address + ", chair="
				+ chair + "]";
	}


	
	

}
