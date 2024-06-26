package sec04;

interface Movable {
	void move(int x);
}

class Car implements Movable {
	private int pos = 0;

	public void move(int x) {
		pos += x;
	}

	public void show() {
		System.out.println(pos + "m 이동했습니다.");
	}
}

public class Practice58 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMyName();
		
		Movable m = new Car();

		m.move(5);
		// m.show();

		Car c = (Car) m;
		c.move(10);
		c.show();
	}
}
