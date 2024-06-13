import java.util.Calendar;

class MyDate{
	Calendar c = Calendar.getInstance();
	
	int year;
	int month;
	int day;
	
	public MyDate(){
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH) + 1;
		day = c.get(Calendar.DAY_OF_MONTH);
		
		// year = 2035;
		// month = 12;
		// day = 25;
	}
}

public class Practice88 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();		

		MyDate d = null;
		
		try {
			System.out.printf("%d년, %d월, %d일\n", d.year, d.month, d.day);
		}		
		catch(NullPointerException e) {
			System.out.println("Null Pointer Exception 발생!");
			d = new MyDate();
			System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
		}		
	}
}
