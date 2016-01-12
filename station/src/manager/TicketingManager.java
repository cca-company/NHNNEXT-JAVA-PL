package manager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import object.Client;
import object.DijkstraCalculator;
import object.GraphCalculator;
import object.station.Station;

public class TicketingManager {
	private static TicketingManager instance = new TicketingManager();
	private int time = 0;
	private StationManager stationManager = StationManager.getInstance();
	private ClientManager clientManager = ClientManager.getInstance();
	private GraphCalculator calculator = DijkstraCalculator.getInstance();
	
	private TicketingManager(){}
	
	public static TicketingManager getInstance(){
		return TicketingManager.instance;
	}
	
	public void init() throws IOException{
		clientManager.loadData("clients.csv");
		stationManager.loadData("map.csv");
	}
	
	public void startTicketing() throws IOException{
		while(!clientManager.allClientsArrived()){
			System.out.println("time:"+time);
			ArrayList<Client> enterClients = clientManager.getEnterClients(time);
			for(Client client : enterClients){
				Station station = stationManager.getStation(client.getStartStation());
				System.out.println(client.getStartStation());
				station.enterClient(client);
			}
			stationManager.update(time);
			this.time++;
		}
		System.out.println("end");
		clientManager.writeData("clients_result.csv");
	}
}
