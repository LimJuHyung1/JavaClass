package superPractice;

public class Ball extends Circle {
	private String color;

	public Ball(String color) {
		this.color = color;
	}

	public void findColor() {
		System.out.println(color + " 공이다.");
	}

	@Override
	public void findArea() {
		// findRadius();		
		
		System.out.print("원(부모)의 ");
		super.findArea();

		System.out.println("면적은 4*(π*반지름*반지름)이다.");
	}

	public void findVolume() {
		System.out.println("부피는 4/3*(π*반지름*반지름*반지름)이다.");
	}
	
	@Override
	public void printMyName() {
		System.out.println("나는 공이다.");
	}
}