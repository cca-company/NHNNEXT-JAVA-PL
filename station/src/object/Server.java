package object;

public class Server {
	private Client serveClient = null;

	public Server() {
	}

	public void setServeClient(Client client) {
		this.serveClient = client;
	}

	public Client getServeClient() {
		return this.serveClient;
	}

	public void removeServeClient() {
		this.serveClient = null;
	}

	public boolean isBusy() {
		if (this.serveClient != null)
			return true;
		return false;
	}
}
