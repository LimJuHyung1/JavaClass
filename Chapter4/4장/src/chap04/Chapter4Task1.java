class GolfClub{
	int num;
	String name;
	
	public GolfClub() {
		this.num = 7;
		this.name = "아이언";
	}
	
	public GolfClub(int num) {
		this.num = num;
		this.name = "아이언";
	}
	
	public GolfClub(String name) {		
		this.name = name;
	}
	
	
	public void print() {
		if(this.name == "아이언")
			System.out.printf("%d번 %s입니다.\n", this.num, this.name);
		else 
			System.out.printf("%s입니다.\n", name);
	}
}


public class Chapter4Task1 {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMyName();
		
		GolfClub g1 = new GolfClub();
		g1.print();
		
		GolfClub g2 = new GolfClub(8);
		g2.print();
		
		GolfClub g3 = new GolfClub("피터");
		g3.print();
	}

	
}
