
public class LocalDemo63 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();
		
		class Eagle extends Bird {
			public void move() {
				System.out.println("독수리가 난다~~~.");
			}
		}

		Bird e = new Eagle();
		e.move();
	}
}