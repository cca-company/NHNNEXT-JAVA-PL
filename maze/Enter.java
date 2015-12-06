package maze;

public class Enter implements Block {
		
	@Override
	public void bump() {
		System.out.println("입구입니다");
	}

	@Override
	public String getType() {
		return "enter";
	}

	@Override
	public String getMarker() {
		return "E";
	}

}
