package ex;

public class StudentDTO {
	private int studentNumber;
	private String studentName;
	private String studentMajor;
	private String studentMoblie;
		
	public StudentDTO () {
		
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
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
	

	public String toString () {
		return studentNumber +"\t"+ studentName +"\t"+ studentMajor +"\t"+ studentMoblie;
	}

}
