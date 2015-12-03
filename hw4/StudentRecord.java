package hw4;

public class StudentRecord {

	public static void main(String[] args) {
		SchoolManager schoolManager = SchoolManager.getInstance();
		schoolManager.addStudent("이승기", 141213, "Math");
		schoolManager.addStudent("김수현", 141518, "Eng");
		schoolManager.addStudent("주원", 141230, "Math");
		schoolManager.addStudent("김우빈", 141255, "Math");
		schoolManager.addStudent("이민호", 141590, "Eng");

		schoolManager.printStudentGrade(141213,"Math",95);
		schoolManager.printStudentGrade(141213,"Eng",20);
		schoolManager.printStudentGrade(141518,"Math",90);
		schoolManager.printStudentGrade(141518,"Eng",100);
		schoolManager.printStudentGrade(141230,"Math",76);
		schoolManager.printStudentGrade(141230,"Eng",60);
		schoolManager.printStudentGrade(141255,"Math",85);
		schoolManager.printStudentGrade(141255,"Eng",89);
		schoolManager.printStudentGrade(141590,"Math",90);
		schoolManager.printStudentGrade(141590,"Eng",95);
	}

}
