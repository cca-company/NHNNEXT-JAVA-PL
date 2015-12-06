package maze;

public class Wall implements Block {

	@Override
	public void bump() {
		System.out.println("벽에 부딛혔습니다!");
	}

	@Override
	public String getType() {
		return "wall";
	}

	@Override
	public String getMarker() {
		return "W";
	}

}
