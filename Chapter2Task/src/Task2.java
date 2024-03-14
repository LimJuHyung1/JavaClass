import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		double w, h, area;
		Scanner in = new Scanner(System.in);
		
		System.out.println("2019305061 임주형");
		
		System.out.print("정수를 입력하세요 : ");
		w = in.nextInt();		
		
		area = w * h;
		System.out.printf("직사각형의 넓이는 %.1f 입니다.", area);
	}

}
