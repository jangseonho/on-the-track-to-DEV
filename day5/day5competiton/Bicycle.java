package day5competiton;

public class Bicycle implements Vehicle{

	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void move() {
		System.out.println("Bicycle [speed=" + speed + "]");
	}
	
	
	
	
}
