
public class Practice85 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();		

		int[] array = { 0, 1, 2 };
		
		try {
			System.out.println("마지막 원소 => " + array[3]);
			System.out.println("첫 번째 원소 => " + array[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("원소가 존재하지 않습니다.");
		}
		
		System.out.println("어이쿠!!!");
	}
}