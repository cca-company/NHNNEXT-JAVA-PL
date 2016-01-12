package object;
import java.util.ArrayList;

public class Platform {
	private ArrayList<Client> clients = new ArrayList<Client>();
	
	public Platform(){
	
	}
	
	public void addClient(ArrayList<Client> ticketingCilents){
		clients.addAll(ticketingCilents);
	}
	
	public void startTrain(int time){
		for(Client client : clients){
			//TODO
			int arriveTime = time;
			client.setArriveTime(arriveTime);
		}
		clients.clear();
	}
}
