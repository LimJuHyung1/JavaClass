
public class Anonymous2Demo63 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();
		
		Bird b = new Bird() {
			public void move() {
				System.out.println("독수리가 난다~~~.");
			}
		};
		b.move();
	}
}