package hw1;

public class BirthDayTest {
	public static void main(String[] args){
		BirthDay d1 = new BirthDay(29,2, 2100);
		System.out.println(d1.checkValidate());
		
		BirthDay d2 = new BirthDay(29, 2, 2000);
		System.out.println(d2.checkValidate());

		BirthDay d3 = new BirthDay(1, 3, 2010);
		System.out.println(d3.checkValidate());

		BirthDay d4 = new BirthDay(31, 4, 2012);
		System.out.println(d4.checkValidate());
		
		BirthDay d5 = new BirthDay(31, 3, 2012);
		System.out.println(d5.checkValidate());

		BirthDay d6 = new BirthDay(1, 13, 2015);
		System.out.println(d6.checkValidate());
	}
}
