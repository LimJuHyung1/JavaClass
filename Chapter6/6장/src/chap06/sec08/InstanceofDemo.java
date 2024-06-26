package sec08;

public class InstanceofDemo {
	public static void main(String[] args) {
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
			System.out.println("ok, 하향 타입 변환");
		}
	}
}