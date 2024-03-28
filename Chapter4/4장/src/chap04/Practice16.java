class Circle {
	double radius;

	double findArea() {
		return 3.14 * radius * radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double r) {
		this.radius = r;
	}

	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}
}

public class Practice16 {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}	
	
	public static void main(String[] args) {
		printMyName();
		
		Circle myCircle = new Circle();

		myCircle.setRadius(10.0);		

		myCircle.show(myCircle.getRadius(), myCircle.findArea());
	}
}

