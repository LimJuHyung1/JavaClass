
class Vehicle {
	String name = "탈 것";

	void whoami() {
		System.out.println("나는 탈 것이다.");
	}

	static void move() {
		System.out.println("이동하다.");
	}
}

class Car extends Vehicle {
	String name = "자동차";

	void whoami() {
		System.out.println("나는 자동차이다.");
	}

	static void move() {
		System.out.println("달리다");
	}
}

class SportsCar extends Car {
	void whoami() {
		System.out.println("나는 스포츠 자동차이다..");
	}
}

public class Practice49{
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}		
	
	public static void main(String[] args) {
		printMyName();
		
		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new Car();
		vehicles[1] = new SportsCar();

		for (Vehicle v : vehicles)
			v.whoami();
	}	
}
