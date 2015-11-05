package hw3;

public class Player {
	GameLevel playerLevel;
	
	public void upgradeLevel(GameLevel lv){
		playerLevel = lv;
	}
	
	public GameLevel getGameLevel(){
		return playerLevel;
	}
	
	public void attack(){
		playerLevel.play();
	}
}
