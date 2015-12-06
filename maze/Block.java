package maze;

public interface Block {
	public String getType();
	public String getMarker();
	public abstract void bump();
}
