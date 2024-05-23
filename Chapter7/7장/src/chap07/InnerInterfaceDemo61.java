
class Icon {
	interface Touchable {
		void touch();
	}
}

public class InnerInterfaceDemo61 implements Icon.Touchable {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public void touch() {
		System.out.println("아이콘을 터치한다.");
	}

	public static void main(String[] args) {
		printMyName();
		Icon.Touchable btn = new InnerInterfaceDemo61();
		btn.touch();
	}
}