package maze;

public class Path implements Block {

	@Override
	public void bump() {
		System.out.println("길을 찾았습니다");
	}

	@Override
	public String getType() {
		return "path";
	}

	@Override
	public String getMarker() {
		return "P";
	}

}
