package sec08;

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

public class OverTypeDemo {
	public static void main(String[] args) {
		Vehicle v = new Car();		// new Car() - Car 메서드로 오버라이드 된다.
		System.out.println(v.name);
		v.whoami();
		v.move();		// static 은 오버라이드 되지 않는다 - Car - move() 실행됨
	}
}