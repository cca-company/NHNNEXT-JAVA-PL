package hw3;

public class Board {
	public static void main(String[] args) {
		Player player = new Player();
		
		player.upgradeLevel(GameLevel1.getInstance());
		player.attack();
		player.upgradeLevel(GameLevel2.getInstance());
		player.attack();
		player.upgradeLevel(GameLevel3.getInstance());
		player.attack();
	}
}
