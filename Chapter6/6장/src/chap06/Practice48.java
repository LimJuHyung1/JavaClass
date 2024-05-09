
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
public class Practice48{
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}		
	
	public static void main(String[] args) {
		printMyName();
		
		Vehicle v = new Car();		// new Car() - Car 메서드로 오버라이드 된다.(동적 바인딩?)
		System.out.println(v.name);
		v.whoami();
		v.move();		// static 은 오버라이드 되지 않는다 - Car - move() 실행됨
	}	
}
