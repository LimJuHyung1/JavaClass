
class Circle{
	int radius;
	
	public Circle(int r) {
		this.radius = r;
	}
	
	public void show() {
		System.out.printf("반지름이 %d 인 원이다.\n", radius);
	}
}

class ColoredCircle extends Circle{
	private String color;
	
	public ColoredCircle (int r, String s) {
		super(r);		
		this.color = s;
	}
	
	public void show() {
		System.out.printf("반지름이 %d 인 %s 원이다.\n", radius, color);
	}
}

public class Practice44{
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}		
	
    public static void main(String[] args) {
    	printMyName(); 
    	
    	Circle c1 = new Circle(5);
    	ColoredCircle c2 = new ColoredCircle(10, "빨간색");
    	
    	c1.show();
    	c2.show();
    } 
}
