
public class Practice72 {
	public static void main(String[] args) {
Integer bi1 = new Integer(10);
		
		int i1 = bi1.intValue();
		
		double d = bi1.doubleValue();

		Integer bi2 = 20;
		
		int i2 = bi2 + 20;

		String s1 = Double.toString(3.14);
		
		Float pi = Float.parseFloat("3.14");

		Integer bi3 = Integer.valueOf("11", 16);
		
		Object[]obj = new Object[8];
		
		obj[0] = bi1;
		obj[1] = i1;
		obj[2] = d;
		obj[3] = bi2;
		obj[4] = i2;
		obj[5] = s1;
		obj[6] = pi;
		obj[7] = bi3;		
		
	   for(Object o : obj) {		   
		   System.out.println(o);
	   }		   		
	}
}