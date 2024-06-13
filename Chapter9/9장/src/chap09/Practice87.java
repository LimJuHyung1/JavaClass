
public class Practice87 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();		

		int[] array = { 0, 1, 2 };
		try {
			int x = array[3];
		} catch (Exception e) {
			System.out.println("어이쿠!!!");
		} 
		catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("원소가 존재하지 않습니다.");
		}
		System.out.println("종료.");
	}
}