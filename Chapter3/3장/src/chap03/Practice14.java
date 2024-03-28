import java.util.Scanner;

public class Practice14 {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}
	
	static void feedback(int rank) {
    	String output = switch(rank) {
    		 case 1 -> "아주 잘했습니다.\n";
    		 case 2, 3 -> "잘했습니다.\n";
    		 case 4, 5, 6 -> "보통입니다.\n";    		 
    		 default ->"노력해야겠습니다.\n";    		 
    	};
    	
    	if(rank != -1) System.out.println(output);   
    	else System.out.println("프로그램이 종료되었습니다.");
    }
	
	public static void repeatAsking(Scanner scanner, int yourRank) {		    	
    	do {
    		System.out.println("-1을 입력하면 프로그램이 종료됩니다.");
    		System.out.print("등수를 입력하세요 : ");
    		yourRank = scanner.nextInt();
    		feedback(yourRank);	    		    
    	} while(yourRank != -1);
	}
	
    public static void main(String[] args) {
    	printMyName();
    	
    	int rank = 0;
    	Scanner scan = new Scanner(System.in);
    	
    	
    	repeatAsking(scan, rank);    
    }   
}
