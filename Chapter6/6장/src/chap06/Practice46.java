
public class Practice46{
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}		
	
	public static void main(String[] args) {
		printMyName();
		sec08.Person p;
		sec08.Student s = new sec08.Student();
		
		p = s;	// 업캐스팅
		
		// p.number = 1;
		// p.work();
		
		p.whoami();
	}
}
