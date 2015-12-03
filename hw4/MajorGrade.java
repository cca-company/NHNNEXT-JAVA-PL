package hw4;

public class MajorGrade implements IGrade {

	@Override
	public String getGrade(int score) {
		if(score > 100 || score < 0){
			System.out.println("올바르지 않은 점수입니다");
			return null;
		}else if(score >= 95){
			return "S";
		}else if(score >= 90){
			return "A";
		}else if(score >= 80){
			return "B";
		}else if(score >= 70){
			return "C";
		}else if(score >= 60){
			return "E";
		}else{
			return "F";
		}
	}

}
