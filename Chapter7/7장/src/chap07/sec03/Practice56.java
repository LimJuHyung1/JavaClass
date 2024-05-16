package sec03;

public class Practice56 extends Computer implements Portable {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMyName();
		
		TV tv = new TV();
		Computer com = new Computer();
		Notebook n = new Notebook();
		
		System.out.println("----------예제 1----------");
		tv.turnOn();
		tv.turnOff();
		tv.repair();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();
		// tv.reset();
		// com.reset();		
				
		System.out.println("----------예제 2----------");
		n.turnOn();
		n.turnOff();
		n.inMyBag();
	}
	
	@Override
	public void inMyBag() {
		// 오버라이드		
	}
}
