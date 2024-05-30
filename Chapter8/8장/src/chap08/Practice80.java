
import java.text.MessageFormat;

public class Practice80 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();		

		String java = "Java";
		int version = 8;

		String s = MessageFormat.format("language : {1}\nversion : {0}", version, java);

		System.out.println(s);

		Object[] data = { java, version };

		MessageFormat f = new MessageFormat("language : {0}\nversion : {1}");
	
		System.out.println(f.format(data));
		
		//------------------------------------------------------//
		
		String c = "C";
		String cVersion = "C99";

		Object[]data2 = {c, cVersion};
		
		MessageFormat f2 = new MessageFormat("language : {0}\nversion : {1}");
		
		System.out.println(f2.format(data2));
		
	}
}