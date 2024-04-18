
import java.util.Scanner;
import java.util.ArrayList;

public class Practice30{
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}	
	
	public static void nPrintln(String s, int n) {
		for (int i = 0; i < n; i++)
			System.out.println(s);
	}
	
    public static void main(String[] args) {
    	printMyName();
    	
		if (args.length == 2) {
			int i = Integer.parseInt(args[1]);
			nPrintln(args[0], i);
		} 
		else
			System.out.println("Damn it!");
    }
}
