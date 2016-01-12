package object;

import object.station.Station;

public class Route {
	private Station station1;
	private Station station2;
	private int time;
	
	public Route(Station station1, Station station2, int time){
		this.station1 = station1;
		this.station2 = station2;
		this.time = time;
	}
	
	public int getTime(){
		return this.time;
	}
	
	public Station getConnectedStation(Station startStation){
		return null;
	}

	public boolean isConnected(Station station) {
		if(this.station1 == station) return true;
		else if(this.station2 == station) return true;
		else return false;
	}
}
