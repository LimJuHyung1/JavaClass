import sec08.Person;
import sec08.Student;

public class Practice47{
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}		
	
	public static void main(String[] args) {
		printMyName();
		
		Student s = new Student();
		Person p = new Person();

		System.out.println(s instanceof Person);

		System.out.println(s instanceof Student);

		System.out.println(p instanceof Student);

		// System.out.println(s instanceof String);

		downcast(s);
	}
	
	static void downcast(Person p) {
		if (p instanceof Student) {		// 업 캐스팅
			Student s = (Student) p;		// 다운 캐스팅
			System.out.println("ok, 하향 타입 변환\n");
			s.work();
			// s.whoiam();		// 접근 불가
		}		
	}
}
