package object;

public class Client {
	private String name;
	private int id;
	private String startStation;
	private String endStation;
	private int enterTime;
	private int ticketingTime;
	private int ticketingWaiting;
	private int ticketingCompleteTime;
	private int trainWaiting;
	private int arriveTime;

	public Client(String name, int id, int enterTime, int ticketingTime, String startStation, String endStation) {
		this.name = name;
		this.id = id;
		this.enterTime = enterTime;
		this.ticketingTime = ticketingTime;
		this.startStation = startStation;
		this.endStation = endStation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(int enterTime) {
		this.enterTime = enterTime;
	}

	public int getTicketingTime() {
		return ticketingTime;
	}

	public void setTicketingTime(int ticketingTime) {
		this.ticketingTime = ticketingTime;
	}

	public String getStartStation() {
		return startStation;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	public String getEndStation() {
		return endStation;
	}

	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}

	public int getTicketingWaiting() {
		return ticketingWaiting;
	}

	public void setTicketingWaiting(int ticketingWaiting) {
		this.ticketingWaiting = ticketingWaiting;
	}

	public int getTicketingCompleteTime() {
		return ticketingCompleteTime;
	}

	public void setTicketingCompleteTime(int ticketingCompleteTime) {
		this.ticketingCompleteTime = ticketingCompleteTime;
	}

	public int getTrainWaiting() {
		return trainWaiting;
	}

	public void setTrainWaiting(int trainWaiting) {
		this.trainWaiting = trainWaiting;
	}

	public int getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(int arriveTime) {
		this.arriveTime = arriveTime;
	}

	@Override
	public String toString() {
		return id + "," + name + "," + startStation + "," + endStation + "," + enterTime + "," + ticketingTime + ","
				+ ticketingWaiting + "," + ticketingCompleteTime + "," + trainWaiting + "," + arriveTime;
	}

}
