public class Practice15 {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}	
	
    public static void main(String[] args) {
    	printMyName();
    	
    	Phone myPhone = new Phone();
		myPhone.model = "갤럭시 S8";
		myPhone.value = 100;
		myPhone.number = "010-1234-5678";
		myPhone.print();

		Phone yourPhone = new Phone();
		yourPhone.model = "G6";
		yourPhone.value = 85;
		yourPhone.number = "010-4321-5432";
		yourPhone.print(); 
		
		Phone ourPhone = new Phone();
		ourPhone.model = "iPhone 13";
		ourPhone.value = 150;
		ourPhone.number = "010-4444-5555";
		ourPhone.print(); 
    }   
}

class Phone {
	String model;	
	int value;
	String number;

	void print() {
		System.out.println(value + "만원 짜리 " + model + " 스마트폰 " + number + " 전화번호");
	}
}