
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Chapter8Task {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}
	
	// 입력
	public static String getString(Scanner s) {
		String str = s.nextLine();
		System.out.println("입력 : " + str);
		return str;
	}
		
	// 입력 String 토큰 정렬
	public static String[] sortTokens(StringTokenizer st) {
		int i = 0;
		String[] tokens = new String[st.countTokens()];
		
		while (st.hasMoreTokens()) {
			tokens[i] = st.nextToken();
			i++;
		}
		
		Arrays.sort(tokens);
		
		return tokens;
	}
	
	// 정렬된 토큰을 하나씩 출력
	public static void printTokens(String[] tokens) {
		System.out.print("정렬된 토큰 : ");
		
		for(int i = 0; i < tokens.length; i++) {
			System.out.print(tokens[i] + ", ");
		}
	}
	
	public static void main(String[] args) {
		printMyName();
		
		Scanner s = new Scanner(System.in);
		String input;		
		String[] tokens;
		StringTokenizer st;
		
		// 문자열 입력
		input = getString(s);		
		
		// 토큰 개수 출력
		st = new StringTokenizer(input, " ");		
		System.out.println("단어 개수 : " + st.countTokens());

		tokens = sortTokens(st);
		printTokens(tokens);		
	}

}
