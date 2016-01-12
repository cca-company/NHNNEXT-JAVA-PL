package manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import object.Client;

public class ClientManager {
	private static ClientManager instance = new ClientManager();
	private ArrayList<Client> clients = new ArrayList<Client>();

	private ClientManager() {
	}

	public static ClientManager getInstance() {
		return ClientManager.instance;
	}

	public void loadData(String filename) throws IOException {
		String path = "./data/";
		File file = new File(path + filename);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			String[] tocken = line.split(",");
			Client client = new Client(tocken[1], Integer.parseInt(tocken[0]), Integer.parseInt(tocken[2]),
					Integer.parseInt(tocken[3]), tocken[4], tocken[5]);
			clients.add(client);
		}
		br.close();
	}

	public ArrayList<Client> getEnterClients(int time) {
		ArrayList<Client> enterClients = new ArrayList<Client>();
		for (Client client : clients) {
			if (client.getEnterTime() == time) {
				enterClients.add(client);
			}
		}
		return enterClients;
	}

	public boolean allClientsArrived() {
		for (Client client : clients) {
			if (client.getArriveTime() == 0)
				return false;
		}
		return true;
	}

	public void writeData(String filename) throws IOException {
		String path = "./data/";
		File file = new File(path + filename);
		FileWriter fw = new FileWriter(file);
		BufferedWriter out = new BufferedWriter(fw);

		out.write("고객아이디,고객이름,출발역,도착역,도착시간,티켓팅소요시간,티켓팅대기시간,티켓팅완료시간,열차대기시간,도착시간");
		out.newLine();
		
		for(Client client : clients){
			out.write(client.toString());
			out.newLine();
		}
		out.close();

	}
}
