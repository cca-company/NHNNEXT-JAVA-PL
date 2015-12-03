package hw4;

public class Student {
	protected String name;
	protected int studentNum;
	protected String major;

	public Student(String name, int studentNum, String major) {
		this.name = name;
		this.studentNum = studentNum;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public String getMajor() {
		return major;
	}
	
}
