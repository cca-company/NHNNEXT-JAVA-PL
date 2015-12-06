package maze;

import java.util.ArrayList;
import java.util.HashMap;

public class Maze {
	private HashMap<Coord,Block> blockMap =  new HashMap<Coord,Block>();
	private Coord enter = null;
	private Coord exit = null;
	private int width;
	private int height;
	
	public Maze(int width, int height, Coord enter, Coord exit){
		this.width = width;
		this.height = height;
		
		for(int x = 0; x < this.width; ++x){
			for(int y = 0; y < this.height; ++y){
				Coord coord = new Coord(x,y);
				if(enter.equals(coord)){
					this.addBlock(coord, "enter");
					this.enter = enter;
				}else if(exit.equals(coord)){
					this.addBlock(coord, "exit");
					this.exit = exit;
				}else{
					this.addBlock(coord, "wall");
				}
			}
		}
		
		if(this.enter == null){
			System.out.println("입구가 범위 내에 존재하지 않습니다 ");
		}
		if(this.exit == null){
			System.out.println("출구가 범위 내에 존재하지 않습니다 ");
		}
		
	}
	
	public void addPathList(ArrayList<Coord> pathList){
		for(Coord coord : pathList){
			Block block = this.blockMap.remove(coord);
			if(block == null){
				System.out.println("해당 좌표는 존재하지 않습니다 : "+coord);
				return;	
			}
			this.addBlock(coord, "path");
		}
	}
	
	
	public Coord getEnter(){
		return this.enter;
	}
	
	public Coord getExit(){
		return this.exit;
	}
	
	public String getBlockTypeByCoord(Coord coord){
		Block block = this.blockMap.get(coord);
		if(block == null) return "wall";
		return block.getType();
	}
	
	private void addBlock(Coord coord, String type){
		Block block;
		if(type == "path"){
			block = new Path();
		}else if(type == "enter"){
			block = new Enter();
		}else if(type == "exit"){
			block = new Exit();
		}else{
			block = new Wall();
		}
		this.blockMap.put(coord,block);
	}
	
	public void printMaze(){
		String mazeString = "";
		for(int y = 0; y < this.width; ++y){
			for(int x = 0; x < this.height; ++x){
				mazeString += this.blockMap.get(new Coord(x,y)).getMarker()+" ";
			}
			mazeString += "\n";
		}
		System.out.print(mazeString);
	}
}
