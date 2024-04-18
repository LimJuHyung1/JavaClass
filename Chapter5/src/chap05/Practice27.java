
import java.util.Scanner;

public class Practice27{
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}	
	
	// 10개의 숫자를 입력받아 배열로 반환
	public static int[] inputInt(Scanner in) {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		return arr;
	}
	
	// 배열 속 모든 요소를 더해 반환
	public static int addScores(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		
		System.out.println("sum = " + sum);
		return sum;
	}
	
	// 배열 평균 출력
	public static void printScoresAvg(int sum) {
		System.out.println("평균 = " + sum / 10.0);
	}
	
    public static void main(String[] args) {
    	printMyName();
    	
		Scanner in = new Scanner(System.in);
		int scores[] = new int[10];
		int sum = 0;

		scores = inputInt(in).clone();

		sum = addScores(scores);

		printScoresAvg(sum);
    }
}
