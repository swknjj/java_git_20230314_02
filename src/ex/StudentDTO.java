package ex;

public class StudentDTO {
	private Long id; // 관리번호
	private String studentNumber; // 학번
	private String studentName; // 이름
	private String studentMajor;// 전공
	private String studentMoblie;// 전화번호

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

	public String toString() {
		String str = studentNumber + "\t" + studentName + "\t" + studentMajor + "\t" + studentMoblie;
		return str;
	}

}
