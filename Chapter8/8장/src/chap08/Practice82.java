
import java.text.DecimalFormat;

public class Practice82 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();		

		DecimalFormat f1 = new DecimalFormat("#");
		DecimalFormat f2 = new DecimalFormat("000000000.00");
		DecimalFormat f3 = new DecimalFormat("#.000");
		DecimalFormat f4 = new DecimalFormat("#,###.##");
		DecimalFormat f5 = new DecimalFormat("-#.#");
		DecimalFormat f6 = new DecimalFormat("#.##E00");
		DecimalFormat f7 = new DecimalFormat("+#.#;-#.#");
		DecimalFormat f8 = new DecimalFormat("#.00%");
		DecimalFormat f9 = new DecimalFormat("000000000.##E01");

		System.out.println(f1.format(1234567.890));
		System.out.println(f2.format(1234567.890));
		System.out.println(f3.format(1234567.890));
		System.out.println(f4.format(1234567.890));
		System.out.println(f5.format(1234567.890));
		System.out.println(f6.format(1234567.890));
		System.out.println(f7.format(1234567.890));
		System.out.println(f7.format(-1234567.890));
		System.out.println(f8.format(1234567.890));
		System.out.println(f9.format(1234567.890));
	}
}