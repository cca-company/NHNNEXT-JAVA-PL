package hw2;

public class CarCompanyTest {

	public static void main(String[] args) {
		CarCompany carCompany = CarCompany.getInstance();
		
		carCompany.addCar("Sonata");
		carCompany.addCar("Sonata");
		carCompany.addCar("Sonata");
		carCompany.addCar("Grandeur");
		carCompany.addCar("Grandeur");
		carCompany.addCar("Genesis");
		
		System.out.println("모든 차의 가격 : "+carCompany.getCarPrice());
	}
}
