package sec02;

public class StringBuilderDemo {
	public static void main(String[] args) {
		String s = new String("hi");		// 원래 메모리 상의 객체
		System.out.println(s.hashCode());
		s = s + "!";									// 메모리 상의 새로운 공간 만들고, 전의 객체 공간 없애버림
		System.out.println(s.hashCode());

		StringBuilder sb = new StringBuilder("hi");
		System.out.println(sb.hashCode());
		sb = sb.append("!");
		System.out.println(sb.hashCode());

		System.out.println(sb.replace(0, 2, "Good bye").insert(0, "Java, "));
	}
}