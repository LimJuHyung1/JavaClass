class Circle2 {
	private double radius;
	
	public Circle2() {
		this.radius = 1.0;
	}
	
	public Circle2(double r) {
		this.radius = r;
	}
	
	public double getRadius() {
		return this.radius;
	}
}

public class Practice19 {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}	
	
	public static void main(String[] args) {
		printMyName();
		
		Circle2 myCircle = new Circle2(10.0f);
		Circle2 yourCircle = new Circle2();
		
		System.out.println(myCircle.toString() + "'s radius : " + myCircle.getRadius());
		System.out.println(yourCircle.toString() + "'s radius : " + yourCircle.getRadius());
	}
}
