package hw1;

public class BirthDay {
	private int day;
	private int month;
	private int year;
	
	public BirthDay(int pDay, int pMonth, int pYear){
		day = pDay;
		month = pMonth;
		year = pYear;
	}
	
	// TODO : 생일 유효성 검사하여 boolean으로 리턴
	public boolean checkValidate(){
		
		if(year < 0) return false;
		
		if(month < 1 || month > 12) return false;
		
		if(day < 1) return false;

		int lastDay;
		lastDay = (month % 2 == 0)? 30 : 31 ;
		
		if(month == 2){
			// 2월 29일이 해당하는 연도인가 체크
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
				lastDay = 29;
			}else{
				lastDay = 28;
			}
		}
		if(month == 12){
			lastDay = 31;
		}
		
		if(day > lastDay) return false;
		
		return true;
	}
}
