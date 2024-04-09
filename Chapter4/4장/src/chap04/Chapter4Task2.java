class Dice{
	int face;
	int maxFace = 6;
	int minFace = 1;
	
	// 1 ~ 6 사이의 범위 출력 테스트
	public void printAllFace() {
		System.out.println("------1 ~ 6 사이의 범위 출력------");
		for(int i = 0; i < maxFace; i++) {
			face = (int)(Math.random() * (maxFace - minFace + 1)) + minFace;
			System.out.println(face);
		}
		System.out.println("------------------------------");
	}
	
	public int roll() {
		face = (int)(Math.random() * (maxFace - minFace + 1)) + minFace;
		return face; 
	}	
}


public class Chapter4Task2 {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMyName();
		
		Dice d = new Dice();
		d.printAllFace();
		System.out.println("주사위의 숫자 : " + d.roll());		
	}

	
}
