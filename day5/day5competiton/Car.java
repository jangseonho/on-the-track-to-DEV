package day5competiton;

public class Car implements Vehicle{

	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void move() {
		System.out.println("Car [speed=" + speed + "]");
	}
	
	
	
	
	
}
