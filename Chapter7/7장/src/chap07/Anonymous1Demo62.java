
public class Anonymous1Demo62 {
	Bird e = new Bird() {
		public void move() {
			System.out.println("독수리가 난다~~~.");
		}

		void sound() {
			System.out.println("휘익~~~.");
		}
	};

	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();
		Anonymous1Demo62 a = new Anonymous1Demo62();
		a.e.move();
		// a.e.sound();
	}
}