
public class MemberDemo62 {
	class Eagle extends Bird {
		public void move() {
			System.out.println("독수리가 난다~~~.");
		}

		public void sound() {
			System.out.println("휘익~~~.");
		}
	}

	Eagle e = new Eagle();

	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();
		
		MemberDemo62 m = new MemberDemo62();
		m.e.move();
		m.e.sound();
	}
}