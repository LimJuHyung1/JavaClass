
class Phone{
	protected String owner;
	
	public Phone(String s) {
		owner = s;
	}
	
	void talk() {
		System.out.println(owner + "가 통화 중이다.");
	}
}

class Telephone extends Phone{
	private String when;
	
	public Telephone(String x, String y) {
		super(x);
		when = y;
	}
	
	void autoAnswering() {
		System.out.println(super.owner + "가 없다. " + when + " 전화 줄래.");		
	}
}

class Smartphone extends Phone{
	private String game;
	public Smartphone(String a, String b) {
		super(a);
		game = b;
	}
	
	void playGame() {
		System.out.println(super.owner = "이가 " + game + " 게임을 하는 중이다.");
	}
}

public class Chapter6Task1 {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}
	
	public static void main(String[] args) {
		printMyName();
		
		Phone[] phones = {new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그")};
		
		for(Phone phone : phones) {
			if (phone instanceof Telephone) {
				((Telephone)phone).autoAnswering();
			}
			else if(phone instanceof Smartphone){
				((Smartphone)phone).playGame();
			}
			else if (phone instanceof Phone) {
				phone.talk();
			}
		}
	}

}
