package object;

import java.util.ArrayList;
import java.util.HashMap;

public class Node {
	protected ArrayList<Edge> edges = new ArrayList<Edge>();
	protected String name;
	protected HashMap<String, Integer> weights = new HashMap<String, Integer>();
	protected String color;
	
	public Node(String name){
		this.name = name;
		this.color = "white";
	}
	
	public String getName(){
		return this.name;
	}
	
	public void addEdge(Edge edge){
		if(edge.isConnected(this)){
			this.edges.add(edge);
		}
	}
	
}
