
public class Practice37{
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}		
	
    public static void main(String[] args) {
    	printMyName(); 
    	
    	for (Direction d : Direction.values())
    		System.out.print(d + " ");    	       
    }
    
    enum Direction{
    	동, 서, 남, 북;
    }    
}
