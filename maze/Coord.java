package maze;

public class Coord {
	private int x;
	private int y;
	
	Coord(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public Coord add(int x, int y) {
		return new Coord(this.getX()+x, this.getY()+y);
	}
	
	public Coord add(Coord coord) {
		return new Coord(this.getX()+coord.getX(), this.getY()+coord.getY());
	}

	public Coord add(int num){
		return new Coord(this.getX()+num, this.getY()+num);
	}

	@Override
	public boolean equals(Object o){
		Coord coord = (Coord)o;
		return (this.getX() == coord.getX() && this.getY() == coord.getY());
	}

	@Override
	public int hashCode(){
		return this.getX() * 31 + this.getY();		
	}
	
	@Override
	public String toString(){
		return this.getX()+","+this.getY();
	}
}
