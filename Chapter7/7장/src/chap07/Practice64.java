
interface Edlible{
	void eat();
}

interface Sweetable{
	void sweet();
}

interface Delicious extends Edlible, Sweetable{
	
}

public class Practice64 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMyName();

	}
}
