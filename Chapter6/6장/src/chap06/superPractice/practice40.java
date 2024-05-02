package superPractice;

public class practice40 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();
		
		Circle c1 = new Circle();
		Ball c2 = new Ball("빨간색");

		System.out.println("원 :");
		c1.findRadius();
		c1.findArea();
		c1.printMyName();

		System.out.println("\n공 :");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolume();
		c2.printMyName();
	}
}
