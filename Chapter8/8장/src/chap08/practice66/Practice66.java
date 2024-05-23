
package practice66;

public class Practice66 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMyName();

		Keyboard k = new Keyboard("Logitech");
		Mouse m = new Mouse("Logitech");

		Class c1 = k.getClass();
		System.out.println(c1.getName());
		System.out.println(c1.getSimpleName());
		System.out.println(c1.getTypeName());
		System.out.println(c1.getPackage().getName()+ '\n');
		
		Class c2 = m.getClass();
		System.out.println(c2.getName());
		System.out.println(c2.getSimpleName());
		System.out.println(c2.getTypeName());
		System.out.println(c2.getPackage().getName());
	}
}
