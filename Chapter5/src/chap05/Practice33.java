
public class Practice33{
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}		
	
    public static void main(String[] args) {
    	printMyName();    	
    
    	Gender gender = Gender.FEMALE;
        if (gender == Gender.MALE)
            System.out.println(Gender.MALE + "은 병역 의무가 있다.");
        else
            System.out.println(Gender.FEMALE + "은 병역 의무가 없다.");
        
        // if (gender == Direction.SOUTH)
        //  	System.out.println(Direction.SOUTH + "는 누구?");
        // gender = 5;
    }
    
    enum Gender { MALE, FEMALE }

    enum Direction { EAST, WEST, SOUTH, NORTH }
}
