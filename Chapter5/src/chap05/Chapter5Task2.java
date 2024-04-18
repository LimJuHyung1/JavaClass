
import java.util.Scanner;

public class Chapter5Task2{
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}		
	
	
	// 끝의 단어가 com 으로 끝나는지 확인
	public static boolean isEndedWithTheCom(String url) {
		String lastThreeChar = url.substring(url.length()-3, url.length());
		
		return lastThreeChar.equals("com"); 
	}
	
	// java 를 포함하는지 확인
	public static boolean isContainedTheJava(String url) {
		return url.contains("java"); 
	}
	
	public static void checkURL(Scanner in) {
		String url;
		
		// 입력값이 bye가 아닌 경우 반복함
		while(true) {
			System.out.print("\nURL을 입력하세요 : ");		
			url = in.nextLine();		
			
			if(url.equals("bye")) {
				System.out.println("프로그램이 종료되었습니다."); 
				break;
			}								
			
			if(isEndedWithTheCom(url))
				System.out.printf("%s은 'com'으로 끝납니다.\n", url);
			else
				System.out.printf("%s은 'com'으로 끝나지 않습니다.\n", url);
			
			if(isContainedTheJava(url))
				System.out.printf("%s은 'java'를 포함합니다.\n", url);
			else
				System.out.printf("%s은 'java'를 포함하지 않습니다.\n", url);
		}
	}
	
    public static void main(String[] args) {
    	printMyName();
    	
    	Scanner in = new Scanner(System.in);
		
    	checkURL(in);
    }
}
