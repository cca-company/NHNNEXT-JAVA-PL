package hw3;

public class GameLevel1 extends GameLevel{
	private static GameLevel1 instance = new GameLevel1();
	
	GameLevel1(){
		level = 1;
	}

	public static GameLevel1 getInstance(){
		return instance;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("level"+level+" simple attack: 메롱~~~");
	}

	@Override
	public void turnAttack() {
		System.out.println("level"+level+" turn attack: 못하지롱");		
	}

	@Override
	public void flyingAttack() {
		System.out.println("level"+level+" flying attack: 이것도 못하지롱");
	}

}
