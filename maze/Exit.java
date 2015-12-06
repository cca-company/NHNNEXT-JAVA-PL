package maze;

public class Exit implements Block {
		
	@Override
	public void bump() {
		System.out.println("출구를 찾았습니다");
	}

	@Override
	public String getType() {
		return "exit";
	}

	@Override
	public String getMarker() {
		return "X";
	}

}
