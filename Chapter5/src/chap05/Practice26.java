
public class Practice26{
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}	
	
	static int countChar(String s, char c) {
		int cnt = 0;
		for(int i = 0; i < s.length(); i++) {
			if(c == s.charAt(i))
				//System.out.println(s.charAt(i));
				cnt++;
		}
		
		return cnt;
	}
	
    public static void main(String[] args) {
    	printMyName();
    	
    	String s1 = "asdfqwerzxcv";
    	String s2 = "ccccccc";
    	String s3 = "Java";
    	
    	char c1 = 'q';
    	char c2 = 'c';
    	char c3 = 'a';
    	
    	System.out.printf("%s 문자열에서 %c 문자는 총 %d개 나왔습니다.\n", s1, c1, countChar(s1, c1));
    	System.out.printf("%s 문자열에서 %c 문자는 총 %d개 나왔습니다.\n", s2, c2, countChar(s2, c2));
    	System.out.printf("%s 문자열에서 %c 문자는 총 %d개 나왔습니다.\n", s3, c3, countChar(s3, c3));    	    
    }
}
