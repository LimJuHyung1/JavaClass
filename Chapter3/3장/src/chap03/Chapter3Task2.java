public class Chapter3Task2 {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}

	public static void printStairs() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
    public static void main(String[] args) {
    	printMyName();
    	
    	printStairs();
	
    }   
}
