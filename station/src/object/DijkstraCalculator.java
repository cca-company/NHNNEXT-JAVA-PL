package object;

import java.util.ArrayList;

public class DijkstraCalculator implements GraphCalculator {
	private static DijkstraCalculator instance = new DijkstraCalculator();
	
	private DijkstraCalculator(){}

	public static DijkstraCalculator getInstance() {
		return DijkstraCalculator.instance;
	}

	@Override
	public int calculate(ArrayList<Node> nodes) {
		for(Node node : nodes){
			
		}
		return 0;
	}

}
