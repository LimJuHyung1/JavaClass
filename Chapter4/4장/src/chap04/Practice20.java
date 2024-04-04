class Circle3 {
	private double radius;
	private String color;
	
	public Circle3(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public Circle3(double radius) {
		this(radius, "파랑");
	}

	public Circle3(String color) {
		this(10.0, color);
	}

	public Circle3() {
		this(10.0, "빨강");
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public String getColor() {
		return this.color;
	}
}

public class Practice20 {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}	
	
	public static void main(String[] args) {
		printMyName();
		
		Circle3 firstCircle = new Circle3(10.0f, "초록");
		Circle3 secondCircle = new Circle3(5.0f);
		Circle3 thirdCircle = new Circle3("검정");
		Circle3 fourthCircle = new Circle3();		
		System.out.println("firstCircle's radius : " + firstCircle.getRadius() + ", " + firstCircle.getColor());
		System.out.println("secondCircle's radius : " + secondCircle.getRadius() + ", " + secondCircle.getColor());
		System.out.println("thirdCircle's radius : " + thirdCircle.getRadius() + ", " + thirdCircle.getColor());
		System.out.println("fourthCircle's radius : " + fourthCircle.getRadius() + ", " + fourthCircle.getColor());
	}
}
