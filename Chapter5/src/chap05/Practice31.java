
import java.util.Scanner;
import java.util.ArrayList;

public class Practice31{
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}	
	
	public static void printSum(int... v) {
		int sum = 0;
		for (int i : v)
			sum += i;
		System.out.println(sum);
	}
	
    public static void main(String[] args) {
    	printMyName();
    	
    	printSum(1, 2, 3, 4, 5);
		printSum(10, 20, 30);
		System.out.println(String.format("My score is %.1f", 99.8));
		System.out.println(String.join(", ", "one", "two", "three"));
    }
}
