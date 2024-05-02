
import static java.util.Arrays.sort;

import java.util.Calendar;

public class Practice42{
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}		
	
    public static void main(String[] args) {
    	printMyName(); 
    	
    	int[] data = { 3, 5, 1, 7 };
    	int i = 1;
    	
    	System.out.println("-------정렬 전-------");
		for(int num : data) {
			System.out.println(i + "번째 값 : " + num);
		}
    	
		sort(data);
		
		System.out.println("-------정렬 후-------");
		for(int num : data) {
			System.out.println(i + "번째 값 : " + num);
		}
		
		System.out.println(Calendar.JANUARY);
		Calendar.getInstance();
    } 
}
