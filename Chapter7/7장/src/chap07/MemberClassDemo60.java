
public class MemberClassDemo60 {
	private String secret = "비공개";
	String s = "외부";

	class MemberClass {
		String s = "내부";

		public void show1() {
			System.out.println("내부 클래스");
			System.out.println(secret);

			System.out.println(s);

			System.out.println(MemberClassDemo60.this.s);
		}

		// static String s3 = "정적 맴버 필드";
		// static void show2() {}
	}
	
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMyName();

		MemberClassDemo60 m = new MemberClassDemo60();
		MemberClassDemo60.MemberClass m1 = m.new MemberClass();

		System.out.println(m1.s);
		m1.show1();
	}
}
