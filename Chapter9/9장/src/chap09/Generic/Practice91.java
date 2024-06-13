package Generic;

import sec03.generic.Cup;

public class Practice91 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();		

		Cup<Beer> c1 = new Cup<Beer>();
		Cup<Boricha> c2 = new Cup<Boricha>();
		
        c1.setBeverage(new Beer());
        Beer b1 = c1.getBeverage();
        c1.printMyType();

        c2.setBeverage(new Boricha());
        Boricha b2 = c2.getBeverage();
        c2.printMyType();
	}
}
