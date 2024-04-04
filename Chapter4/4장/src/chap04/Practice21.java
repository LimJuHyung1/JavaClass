class Triangle {		
	private double base;
	private double height;
	
	public Triangle() {
		this.base = 10.0f;
		this.height = 5.0f;
	}
	
	public Triangle(double b, double h) {
		this.base = b;
		this.height = h;
	}
	
	public double findArea() {
		return this.base * this.height;
	}
	
	public boolean isSameArea(Triangle t) {		
		System.out.println("\n이 삼각형의 넒이 : " + this.findArea());
		System.out.println("비교 대상 삼각형의 넒이 : " + t.findArea());
		System.out.print("두 삼각형의 넓이는 같은가? -> ");	
		return this.findArea() == t.findArea() ? true : false;
	}
	
}

public class Practice21 {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}	
	
	public static void main(String[] args) {
		printMyName();
		
		Triangle t = new Triangle(10.0, 5.0);
		System.out.println("1번");
		System.out.println(t.findArea());
		
		System.out.println("\n-----------------");
		System.out.println("2번");
		Triangle t1 = new Triangle(10.0, 5.0);
		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(8.0, 8.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));		
	}
}
