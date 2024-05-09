
public class Practice45{
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}		
	
    public static void main(String[] args) {
    	printMyName(); 
    	
    	sec06.One one = new sec06.One();
    	sec06.One1 one1 = new sec06.One1();
    	sec06.Two two = new sec06.Two();
    	
    	sec06.other.One2 one2 = new sec06.other.One2();
    	sec06.other.Three three = new  sec06.other.Three();
    	
    	System.out.println("---------one 변수---------");
    	one.show();
    	System.out.println("---------one1 변수---------");
    	one1.show();
    	System.out.println("---------two 변수---------");
    	two.print();
    	
    	System.out.println("---------one2 변수---------");
    	one2.print();
    	System.out.println("---------three 변수---------");
    	three.print();
    } 
}
