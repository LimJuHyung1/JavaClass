
public class Practice53 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMyName();
		
		// Shape s = new Shape();

				Circle c = new Circle(3);
				c.draw();
				System.out.printf("원의 넓이는 %.1f\n", c.findArea());

				Rectangle r = new Rectangle(3, 4);
				r.draw();
				System.out.printf("사각형의 넓이는  %.1f\n", r.findArea());
	}

}
