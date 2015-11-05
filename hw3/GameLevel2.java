package hw3;

public class GameLevel2 extends GameLevel{
	private static GameLevel2 instance = new GameLevel2();

	GameLevel2(){
		level = 2;
	}

	public static GameLevel2 getInstance(){
		return instance;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("level"+level+" simple attack: 메롱~~~");
	}

	@Override
	public void turnAttack() {
		System.out.println("level"+level+" turn attack: 돌려차기 씡~~~");		
	}

	@Override
	public void flyingAttack() {
		System.out.println("level"+level+" flying attack: 이건 못하지롱");
	}

}
