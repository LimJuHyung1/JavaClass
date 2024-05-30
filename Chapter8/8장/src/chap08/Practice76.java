
import java.util.StringTokenizer;

public class Practice76 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();
		
		String s = "I have a pen, I have a apple.";

		StringTokenizer st = new StringTokenizer(s, " ,.");

		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.print("[" + st.nextToken() + "] ");
		}
	}
}