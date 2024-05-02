
public class Practice34{
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

        for(Gender g : Gender.values())
            System.out.println(g.name());

        System.out.println(Gender.valueOf("MALE"));
//        System.out.println(gender.toString());
    }
    
    enum Gender {
        MALE("남성"), FEMALE("여성");

        private String s;
//        private String tmp;

        Gender(String s) {
            this.s = s;
//            tmp = "asdf";
        }

        public String toString() {
            return s;
        }
    }
}
