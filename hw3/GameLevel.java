package hw3;

public abstract class GameLevel {
	protected int level;
	
	public abstract void simpleAttack();
	public abstract void turnAttack();
	public abstract void flyingAttack();
	
	public void start(){
		System.out.println("========level "+level+" start=======");
	}

	public void end(){
		System.out.println("========level "+level+" end=======");
	}
	
	public void play(){
		start();
		simpleAttack();
		turnAttack();
		flyingAttack();
		end();
	}
}
