
public class Practice86 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();		

		int dividend = 10;
		try {
			int divisor = Integer.parseInt(args[0]);
			System.out.println(dividend / divisor);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("원소가 존재하지 않습니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("항상 실행됩니다.");
		}
		System.out.println("종료.");
	}
}