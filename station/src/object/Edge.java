package object;


public class Edge {
	private Node node1;
	private Node node2;
	private int weight;
	
	public Edge(Node node1, Node node2, int weight){
		this.node1 = node1;
		this.node2 = node2;
		this.weight = weight;
	}
	
	public int getWeight(){
		return this.weight;
	}
	
	public Node getConnectedNode(Node node){
		if(this.node1 == node) return this.node2;
		else if(this.node2 == node) return this.node1;
		return null;
	}

	public boolean isConnected(Node node) {
		if(this.node1 == node) return true;
		else if(this.node2 == node) return true;
		else return false;
	}
}
