
interface Talkable{
	void talk();
}

class Korean implements Talkable{
	@Override
	public void talk() {
		System.out.println("안녕하세요!");
	}
}

class American implements Talkable{	
	@Override
	public void talk() {
		System.out.println("Hello!");
	}
}

public class Practice59 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	static void speak(Talkable t) {
		// Talkable t = new Korean()(or new American()) 과 같음
		t.talk();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMyName();

		speak(new Korean());
		speak(new American());
	}
}
