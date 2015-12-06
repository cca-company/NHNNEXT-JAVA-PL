package maze;

import java.util.ArrayList;

public class Player {
	private ArrayList<Coord> course = new ArrayList<Coord>();
	private ArrayList<Coord> probedCoords = new ArrayList<Coord>();

	public void addCourse(Coord coord){
		this.course.add(coord);
	}
	
	public boolean searchCourse(Coord searchCoord){
		for(Coord coord : this.course){
			if(coord.equals(searchCoord)){
				return true;
			}
		}
		return false;
	}

	
	public void addProbedCoord(Coord coord){
		this.probedCoords.add(coord);
	}
	
	public boolean searchProbedCoord(Coord searchCoord){
		for(Coord coord : this.probedCoords){
			if(coord.equals(searchCoord)){
				return true;
			}
		}
		return false;
	}
	
	public Coord getLastCourse() {
		return this.course.remove(this.course.size()-1);
	}

	public String courseToString() {
		String courseString = "enter -> ";
		for(Coord coord :this.course){
			courseString += coord + " -> ";
		}
		courseString += "exit";
		return courseString;
	}
}
