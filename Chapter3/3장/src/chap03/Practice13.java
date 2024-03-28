import java.util.Scanner;

public class Practice13 {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}
	
	static void feedback(int rank) {
    	String output = switch(rank) {
    		 case 1 -> "아주 잘했습니다.";
    		 case 2, 3 -> "잘했습니다.";
    		 case 4, 5, 6 -> "보통입니다.";
    		 default ->"노력해야겠습니다.";    		 
    	};
    	
    	System.out.println(output);        
    }
	
    public static void main(String[] args) {
    	printMyName();
    	
    	int rank;
    	Scanner scan = new Scanner(System.in);
    	       
    	System.out.print("등수를 입력하세요 : ");
    	rank = scan.nextInt();
    	
    	feedback(rank);
    }   
}
