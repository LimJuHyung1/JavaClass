
class Circle {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	double findArea() {
		return 3.14 * radius * radius;
	}
}

public class Practice32{
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}		
	
    public static void main(String[] args) {
    	printMyName();
    	
    	Circle[] circles = new Circle[2];

		for (int i = 0; i < circles.length; i++) {
			// 0 ~ 100 사이의 수를 더해 반지름으로 설정
			circles[i] = new Circle(i + (int)(Math.random()*100));
			System.out.printf("원의 넓이(반지름 : %.1f) = %.2f\n", circles[i].radius, circles[i].findArea());
		}
    }
}
