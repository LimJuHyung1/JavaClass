
public class Chapter2Task {

	public static void printMyName() {
		System.out.println("2019305061 임주형");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMyName();
		
		int low = 6;
		
		for(int i = 0; i < low; i++) {
			int tmp = 2 * (i + 1) - 1;
			
			for(int a = 1; a < 6 - i; a++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < tmp; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}	

}
