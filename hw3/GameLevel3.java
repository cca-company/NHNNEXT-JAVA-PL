package hw3;

public class GameLevel3 extends GameLevel{
	private static GameLevel3 instance = new GameLevel3();
	
	GameLevel3(){
		level = 3;
	}

	public static GameLevel3 getInstance(){
		return instance;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("level"+level+" simple attack: 메롱~ 메롱~ 메롱~");
	}

	@Override
	public void turnAttack() {
		System.out.println("level"+level+" turn attack: 뒤돌려차기 앞돌려차기");		
	}

	@Override
	public void flyingAttack() {
		System.out.println("level"+level+" flying attack: 날라차기 휙~~~");
	}

}
