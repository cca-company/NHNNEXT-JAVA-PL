package ticketing;

import java.io.IOException;

import manager.TicketingManager;

public class Ticketing {

	public static void main(String[] args) throws IOException {
		TicketingManager ticketingManager = TicketingManager.getInstance();
		ticketingManager.init();
		ticketingManager.startTicketing();
	}

}
