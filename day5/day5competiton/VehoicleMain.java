package day5competiton;

public class VehoicleMain {

	public static void main(String[] args) {
		Car car = new Car();
        Bicycle bike = new Bicycle();

        // 속도 설정
        car.setSpeed(120);
        bike.setSpeed(25);

        // 이동 전 속도 출력
        System.out.println("자동차 이동 전 속도: " + car.getSpeed());
        System.out.println("자전거 이동 전 속도: " + bike.getSpeed());

        // 이동
        car.move();
        bike.move();

        // 이동 후 속도 출력
        System.out.println("자동차 이동 후 속도: " + car.getSpeed());
        System.out.println("자전거 이동 후 속도: " + bike.getSpeed());

	}

}
