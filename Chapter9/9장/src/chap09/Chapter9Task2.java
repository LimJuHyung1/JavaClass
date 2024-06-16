
class Max<T>{	
	public <T> T max(T parm1, T parm2) {
		if(parm1 instanceof Number && parm2 instanceof Number)
			return ((Number) parm1).doubleValue() > ((Number) parm2).doubleValue() ? parm1 : parm2;
		else if(parm1 instanceof String && parm2 instanceof String)
			return ((String) parm1).length() > ((String) parm2).length() ? parm1 : parm2; 
		else {
			System.out.println("비교할 수 없습니다!");
			return null;
		}			
	}
}

public class Chapter9Task2 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();		

		Max<Number> n = new Max<>();
		System.out.println(n.max(10.0, 8.0));
		System.out.println(n.max(5, 8.0));
		
		Max<String> s = new Max<>();
		System.out.println(s.max("Hello", "Hi"));
		System.out.println(s.max("Good", "morning"));
	}
}
