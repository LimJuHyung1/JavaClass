
import java.text.MessageFormat;

public class Practice81 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();		

		Object[][] data = { {"세종대왕", 1, "조선"}, {"오바마", 2, "미국"}, {"징기스칸", 3, "몽고"}  };
				

		MessageFormat f = new MessageFormat("이름 : {0}\t\t번호 : {1}\t\t국적 : {2}");
	
		for(Object[] o : data) {
			System.out.println(f.format(o));
		}		
	}
}