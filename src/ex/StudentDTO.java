package ex;

import java.util.Objects;

public class StudentDTO {
	private Long id; // 관리번호
	private String studentNumber; // 학번
	private String studentName; // 이름
	private String studentMajor;// 전공
	private String studentMoblie;// 전화번호
	
	//String객체

	public StudentDTO() {

	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentMajor() {
		return studentMajor;
	}

	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}

	public String getStudentMoblie() {
		return studentMoblie;
	}

	public void setStudentMoblie(String studentMoblie) {
		this.studentMoblie = studentMoblie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		String str = studentNumber + "\t" + studentName + "\t" + studentMajor + "\t" + studentMoblie;
		return str;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, studentMajor, studentMoblie, studentName, studentNumber);
	}
	//  두두 객체의 필드값이 모두 일치하는지 판단하려면 hashcode() , equals() 메소드를 반드시 재정의한다
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDTO other = (StudentDTO) obj;
		return Objects.equals(id, other.id) && Objects.equals(studentMajor, other.studentMajor)
				&& Objects.equals(studentMoblie, other.studentMoblie) && Objects.equals(studentName, other.studentName)
				&& Objects.equals(studentNumber, other.studentNumber);
	}
	
	

}
