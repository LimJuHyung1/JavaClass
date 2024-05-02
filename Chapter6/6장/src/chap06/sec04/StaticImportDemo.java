package sec04;

import static java.util.Arrays.sort;		// sort 정적 메소드 사용하겠다 - static 메소드가 아니라면 import static 해도 소용없음

import java.util.Calendar;

public class StaticImportDemo {
	public static void main(String[] args) {
		int[] data = { 3, 5, 1, 7 };
		
		sort(data);
		System.out.println(Calendar.JANUARY);
		Calendar.getInstance();
	}
}