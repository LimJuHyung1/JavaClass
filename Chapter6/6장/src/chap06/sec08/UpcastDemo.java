package sec08;

public class UpcastDemo {
	public static void main(String[] args) {
		Person p;
		Student s = new Student();
		
		p = s;	// 업캐스팅
		
		// p.number = 1;
		// p.work();
		
		p.whoami();
	}
}