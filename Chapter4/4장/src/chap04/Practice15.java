public class Practice15 {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}	
	
    public static void main(String[] args) {
    	printMyName();
    	int total = 0, x = 0, y;
    	while(++x < 5) {
    		y = x * x;
    		System.out.println(y);
    		total += y;
    	}
    	
    	System.out.println("총합은 " + total);
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