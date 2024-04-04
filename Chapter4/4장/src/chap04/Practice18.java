class Rectangle{
	double width;
	double height;
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public void setWidth(double w) {
		this.width = w;
	}
	
	public void setHeight(double h) {
		this.height = h;
	}
	
	void show(double w, double h, double area) {
		System.out.printf("가로 = %.1f, 세로 = %.1f, 넓이 = %.1f", w, h, area);
	}
	
}

public class Practice18 {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}	
	
	public static void main(String[] args) {
		printMyName();
		
		Rectangle myRect = new Rectangle();

		myRect.setWidth(10.0);
		myRect.setHeight(5.0);
			
		myRect.show(myRect.getWidth(), myRect.getHeight(), myRect.getArea());
	}
}
