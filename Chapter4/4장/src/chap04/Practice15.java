import java.util.Scanner;

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
		myPhone.print();

		Phone yourPhone = new Phone();
		yourPhone.model = "G6";
		yourPhone.value = 85;
		yourPhone.print(); 
		
		Phone ourPhone = new Phone();
		ourPhone.model = "G6";
		ourPhone.value = 85;
		ourPhone.print(); 
    }   
}

class Phone {
	String model;
	int value;

	void print() {
		System.out.println(value + "만원 짜리 " + model + " 스마트폰");
	}
}