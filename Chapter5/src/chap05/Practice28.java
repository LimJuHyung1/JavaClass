
import java.util.Scanner;
import java.util.ArrayList;

public class Practice28{
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}	
	
	// 10개의 숫자를 입력받아 리스트로 반환
	public static ArrayList inputInt(Scanner in) {
		int data;
		ArrayList<Integer> arr = new ArrayList<>();
		
		while ((data = in.nextInt()) >= 0)
			arr.add(data);
			
		return arr;
	}
	
	// 리스트 속 모든 요소를 더해 반환
	public static int addScores(ArrayList<Integer> arr) {
		int sum = 0;
		for (int i = 0; i < arr.size(); i++)
			sum += arr.get(i);
		
		System.out.println("sum = " + sum);
		return sum;
	}
	
	// 리스트 평균 출력
	public static void printScoresAvg(int sum) {
		System.out.println("평균 = " + sum / 10.0);
	}
	
    public static void main(String[] args) {
    	printMyName();
    	
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		int sum = 0;		

		scores = inputInt(in);

		sum = addScores(scores);

		printScoresAvg(sum);
    }
}
