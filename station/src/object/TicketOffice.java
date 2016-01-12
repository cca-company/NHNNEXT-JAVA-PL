package object;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TicketOffice {
	private ArrayList<Server> servers = new ArrayList<Server>();
	private Queue<Client> clients = new LinkedList<Client>();
	
	public TicketOffice(){
		for(int i = 0; i < 3; ++i){
			Server newServer = new Server();
			this.servers.add(newServer);
		}
	}
	
	public void addClient(Client clients){
		this.clients.offer(clients);
	}
	
	public ArrayList<Client> ticketing(int time){
		ArrayList<Client> ticketingClients = new ArrayList<Client>();
		for(Server server : servers){
			if(server.isBusy()){
				Client client = server.getServeClient();
				int ticketingTime = client.getEnterTime() + client.getTicketingWaiting() +client.getTicketingTime();
				if(time >= ticketingTime){
					client.setTicketingCompleteTime(ticketingTime);
					ticketingClients.add(client);
					server.removeServeClient();
					server.setServeClient(clients.poll());
				}
			}else{
				server.setServeClient(clients.poll());
			}
		}
		return ticketingClients;
	}

}
