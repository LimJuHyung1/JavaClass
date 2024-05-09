
class Animal {
	public Animal(String s) {
		System.out.println("동물 : " + s);
	}
}

class Mammal extends Animal {
	public Mammal() {
		// super();
		super("원숭이");
		System.out.println("포유류 : 원숭이");
	}

	public Mammal(String s) {
		super(s);
		System.out.println("포유류 : " + s);
	}
}

public class Practice43{
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}		
	
    public static void main(String[] args) {
    	printMyName(); 
    	
    	Mammal ape = new Mammal();
		Mammal lion = new Mammal("사자");
    } 
}
