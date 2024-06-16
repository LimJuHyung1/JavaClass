
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Chapter9Task1 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();		

		String s = "of the people, by the people, for the people";
		try {
			showToken(s, ", ");			
		}catch(NoSuchElementException e){
			System.out.println("끝");
		}		
	}
	
	static void showToken(String s, String tokenizer){
		StringTokenizer st = new StringTokenizer(s, tokenizer);
		
		while (true) {
			System.out.println(st.nextToken());
		}
	}
}
