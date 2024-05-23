
class Circle{
	double radius;
	
	public Circle(double r) {					
		this.radius = r;
	}
	
	/*
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle c = (Circle) obj;
			if (this.radius.equals(c.radius))
				return true;
		}
		return false;
	}
	*/
	
	public boolean equals1(Object obj) {
		if (obj instanceof Circle) {
			Circle c = (Circle) obj;
			if (this.radius == c.radius)
				return true;
		}
		return false;
	}
}

public class Practice70 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMyName();

		Circle c1 = new Circle(3);
		Circle c2 = new Circle(3);
		
		if(c1.equals(c2))
			System.out.println("c1과 c2는 같다.");
		else
			System.out.println("c1과 c2는 다르다.");		
	}
}
