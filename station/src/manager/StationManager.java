package manager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import object.Edge;
import object.station.Station;

public class StationManager {
	private static StationManager instance = new StationManager();
	private HashMap<String, Station> stations = new HashMap<String, Station>();

	private StationManager() {
	}

	public static StationManager getInstance() {
		return StationManager.instance;
	}

	public void loadData(String filename) throws IOException {
		String path = "./data/";
		File file = new File(path + filename);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<Station> addStations = new ArrayList<Station>();

		String line = br.readLine();

		String[] tocken = line.split(",");
		for (String name : tocken) {
			if (name.equals(""))
				continue;
			Station station = new Station(name);
			stations.put(name, station);
			addStations.add(station);
		}

		while (true) {
			line = br.readLine();
			if (line == null)
				break;
			tocken = line.split(",");
			Station startStation = getStation(tocken[0]);
			int num = 1;
			for (Station station : addStations) {
				int weight = Integer.parseInt(tocken[num++]);
				startStation.addEdge(new Edge(startStation, station, weight));
			}
		}
		br.close();
	}

	public Station getStation(String station) {
		return stations.get(station);
	}

	public void update(int time) {
		for (String key : stations.keySet()) {
			stations.get(key).update(time);
		}
	}

}
