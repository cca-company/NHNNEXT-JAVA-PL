package hw4;

import java.util.ArrayList;

public class SchoolManager {
	private static SchoolManager instance = new SchoolManager();
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public static SchoolManager getInstance(){
		if(instance == null){
			instance = new SchoolManager();
		}
		return instance;
	}
	
	public void addStudent(String name, int studentNum, String major){
		Student newStudent = new Student(name, studentNum, major);
		this.studentList.add(newStudent);
	}
	
	public void printStudentGrade(int studentNum, String subject, int score){
		IGrade gradeCalc = null;
		String grade = null;
		Student targetStudent = null;
		
		for(Student student : this.studentList){
			if(student.getStudentNum() == studentNum){
				targetStudent = student;
			}
		}
		
		if(targetStudent == null){
			System.out.println("학번에 해당하는 데이터를 찾을수 없습니다");
		}

		if(targetStudent.getMajor() == subject){
			gradeCalc = new MajorGrade();
		}else{
			gradeCalc = new OptionGrade();
		}
		grade = gradeCalc.getGrade(score);
		
		System.out.println(studentNum+" "+targetStudent.getName()+", 전공:"+targetStudent.getMajor()+", 과목:"+subject+", 점수:"+score+", 학점:"+grade);
	}
}
