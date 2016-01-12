package object.station;
import java.util.ArrayList;

import object.Client;
import object.Edge;
import object.Node;
import object.Platform;
import object.TicketOffice;

public class Station extends Node{
	private TicketOffice ticketOffice = new TicketOffice();
	private Platform platform = new Platform();
	
	public Station(String name){
		super(name);
	}
	
	public void update(int time){
		if(time % 3 == 0){
			platform.startTrain(time);
		}
		ArrayList<Client> ticketingCilents = ticketOffice.ticketing(time);
		platform.addClient(ticketingCilents);
	}
	
	public void enterClient(Client client){
		ticketOffice.addClient(client);
	}
}
