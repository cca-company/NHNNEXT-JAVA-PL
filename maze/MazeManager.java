package maze;

import java.util.ArrayList;

public class MazeManager {
	static private MazeManager instance = new MazeManager();
	private Maze map;
	private Player player;
	private ArrayList<Coord> directList;
	
	public static MazeManager getInstance(){
		return instance;
	}
	
	public void startGame(int direct){
		if(direct == 8){
			System.out.println("8방향 탐색입니다");
		}else if(direct == 4){
			System.out.println("4방향 탐색입니다");
		}else{
			System.out.println("탐색은 8방향,4방향으로만 가능합니다");
		}
		this.init(direct);
		this.searchMaze();
	}
	
	private void init(int direct){
		this.player = new Player();

		this.map = new Maze(8,8, new Coord(0,0), new Coord(7,7));
		ArrayList<Coord> pathList = new ArrayList<Coord>();
		pathList.add(new Coord(0,4));
		pathList.add(new Coord(1,0));
		pathList.add(new Coord(1,1));
		pathList.add(new Coord(1,2));
		pathList.add(new Coord(1,4));
		pathList.add(new Coord(1,5));
		pathList.add(new Coord(1,6));
		pathList.add(new Coord(1,7));
		pathList.add(new Coord(2,2));
		pathList.add(new Coord(2,3));
		pathList.add(new Coord(2,4));
		pathList.add(new Coord(2,6));
		pathList.add(new Coord(3,2));
		pathList.add(new Coord(3,6));
		pathList.add(new Coord(4,1));
		pathList.add(new Coord(4,2));
		pathList.add(new Coord(4,4));
		pathList.add(new Coord(4,5));
		pathList.add(new Coord(4,6));
		pathList.add(new Coord(4,7));
		pathList.add(new Coord(5,0));
		pathList.add(new Coord(5,4));
		pathList.add(new Coord(6,1));
		pathList.add(new Coord(6,4));
		pathList.add(new Coord(6,5));
		pathList.add(new Coord(6,6));
		pathList.add(new Coord(6,7));
		pathList.add(new Coord(7,0));
		pathList.add(new Coord(7,3));		
		this.map.addPathList(pathList);
		
		this.directList = new ArrayList<Coord>();
		
		if(direct == 8){
			this.directList.add(new Coord(1,1));
			this.directList.add(new Coord(1,-1));
			this.directList.add(new Coord(-1,1));
			this.directList.add(new Coord(-1,-1));
		}
		this.directList.add(new Coord(1,0));
		this.directList.add(new Coord(-1,0));
		this.directList.add(new Coord(0,1));
		this.directList.add(new Coord(0,-1));
	}
	
	private void searchMaze(){
		this.map.printMaze();
		Coord coord = this.map.getEnter();
		
		while(coord != null){

			String blockType = this.map.getBlockTypeByCoord(coord);
			
			if(blockType == "path" || blockType == "enter"){
				Coord nextCoord = this.searchValidCoord(coord);
				if(nextCoord != null){
					this.player.addCourse(coord);
					coord = nextCoord;
					continue;
				}
			}else if(blockType == "exit"){
				System.out.println("미로를 빠져나왔습니다. 최종 경로 : "+this.player.courseToString());
				return;
			}
			
			this.player.addProbedCoord(coord);
			coord = this.player.getLastCourse();
		}
		
		System.out.println("출구가 존재하지 않습니다.");
	}
	
	private Coord searchValidCoord(Coord coord){
		Coord validCoord = null;
		for(Coord direct : this.directList){
			Coord searchCoord = coord.add(direct);
			if(!this.player.searchCourse(searchCoord) && !this.player.searchProbedCoord(searchCoord)){
				validCoord = searchCoord;
				break;
			}
		}
		return validCoord;
	}
	
}
