package sec04;

import sec03.Computer;
import sec03.Controllable;
import sec03.TV;

// 추가 동물
class Mouse implements Animal {
	public void sound() {
		System.out.println("찍~~");
	}
}

public class Practice57 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMyName();
		
		Controllable[] controllable = { new TV(), new Computer() };
		
		Dog d = new Dog();
		Cuckoo c = new Cuckoo();
		Mouse m = new Mouse();
		
		System.out.println("----------예제 1----------");
		for (Controllable con : controllable) {
			con.turnOn();
			con.turnOff();
			con.repair();
		}
		Controllable.reset();
				
		System.out.println("----------예제 2----------");
		makeSound(d);		
		makeSound(c);
		makeSound(m);
	}
	
	// 다운캐스팅
	static void makeSound(Animal a) {	// animal a = d or c (?)
		a.sound();
	}
}
