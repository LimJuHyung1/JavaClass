
class Parent{
	String name = "영조";
	void print() {
		System.out.printf("나는 %s 이다", name);
	}
}

class Child extends Parent{
	String name = "사도세자";
	void print() {
		System.out.printf("나는 %s 이다\n", name);
	}
}

public class Practice51 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMyName();
		
		Parent p = new Child();
		System.out.println(p.name);
		p.print();
	}

}
