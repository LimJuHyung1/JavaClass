
class Vehicle1{
	static String color;
	static int speed;
	Vehicle1(String color, int speed){
		this.color = color;
		this.speed = speed;
	}
	static void show() {
		System.out.println("자동차 색상 : " + color);
		System.out.println("자동차 속도 : " + speed);
	}
}

class Car1 extends Vehicle1{
	static int displacement;
	static int gears;
	
	Car1(String color, int speed, int displacement, int gears){
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	
	static void show() {
		System.out.println("자동차 색상 : " + color);
		System.out.println("자동차 속도 : " + speed);
		System.out.println("자동차 배기량 : " + displacement);
		System.out.println("자동차 기어 단수 : " + gears);
	}
}

public class Chapter6Task2 {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}
	
	public static void main(String[] args) {
		printMyName();
		
		Car1 c = new Car1("파랑", 200, 1000, 5);
		c.show();
		
		System.out.println();
		Vehicle1 v = c;
		v.show();
	}
}
