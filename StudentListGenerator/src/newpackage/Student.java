package newpackage;

public class Student {

	//if i change somethings
	private String studentName, studentCourse;
	private int studentNumber;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName, int studentNumber, String studentCourse) {

		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.studentCourse = studentCourse;

	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

}
