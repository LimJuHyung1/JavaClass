
public class LocalClassDemo61 {
	private String s1 = "외부";

	void method() {
		int x = 1;
		class LocalClass {
			String s2 = "내부";
			String s3 = s1;

			public void show() {
				System.out.println("지역 클래스");
				// x = 2;
			}
		}

		LocalClass lc = new LocalClass();
		System.out.println(lc.s2);
		lc.show();
	}
	
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();
		LocalClassDemo61 lcd = new LocalClassDemo61();
		lcd.method();
	}
}