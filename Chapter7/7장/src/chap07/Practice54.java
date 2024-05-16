abstract class Abstract {
	int i;
	
	Abstract(int i){
		this.i = i;
	}
	
	abstract void show();
}
class Concrete extends Abstract{
	int j;
	
	Concrete(int i, int j){
		super(i);
		this.j = j;
	}
	
	public void show() {
		System.out.println("i = " + i + ", j = " + j);
	}
}

public class Practice54 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMyName();
		
		Concrete c = new Concrete(100, 50);
		c.show();
	}
}
