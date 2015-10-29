package hw2;

public class CarCompany {
	private static CarCompany carCompany = new CarCompany(); // 왜 여기서 null이 되는지?
	private static Car[] carList = new Car[10];
	private static int carNum = 0;
	private static int maxCarNum = 10;
	
	private CarCompany(){
		System.out.println("CarCompany 인스턴스를 생성했습니다.");
	}
	
	public static CarCompany getInstance(){
		if(carCompany == null){
			carCompany = new CarCompany();
		}
		return carCompany;
	}
	
	public void addCar(String type){
		Car newCar;
		
		if(carNum == maxCarNum){
			System.out.println("더이상 Car를 추가할수 없습니다");
			return;
		}
		
		switch(type){
		case "Genesis": 
			newCar = new Genesis();
			break;
		case "Sonata":
			newCar = new Sonata();
			break;
		case "Grandeur":
			newCar = new Grandeur();
			break;
		default : 
			System.out.println("차종이 올바르지 않습니다");
			return;
		}
		
		carList[carNum++] = newCar;
	}
	
	public int getCarPrice(){
		int price = 0;
		for(int i = 0; i < carNum; ++i){
			price += carList[i].getPrice();
		}
		return price;
	}
}
