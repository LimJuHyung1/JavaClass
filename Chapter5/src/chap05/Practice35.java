
public class Practice35{
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}		
	
    public static void main(String[] args) {
    	printMyName();    	
    
    	Gender gender = Gender.여성;

        String s = switch(gender) {
            case 남성 -> "은 병역 의무가 있다.";
            case 여성 -> "은 병역 의무가 없다.";
            // default -> "asdf";            	
        };
        System.out.println(gender + s);
    }
    
    enum Gender {
        남성, 여성
    }
}
