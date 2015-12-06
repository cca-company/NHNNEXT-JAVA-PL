package maze;

public class PlayGame {

	public static void main(String[] args) {
		MazeManager mm = MazeManager.getInstance();
		
		mm.startGame(Integer.parseInt(args[0]));
	}

}
