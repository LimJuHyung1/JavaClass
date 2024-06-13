
class Ticket implements Comparable<Ticket> {
	int no;

	public Ticket(int no) {
		this.no = no;
	}

	public int compareTo(Ticket o) {
		Ticket t = o;
		return no < t.no ? -1 : (no > t.no ? 1 : 0);
	}
}

public class Practice94 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static <T extends Comparable> int countGT(T[] a, T elem) {
		int count = 0;
		for (T e : a)
			if (e.compareTo(elem) > 0)
				++count;
		return count;
	}
	
	public static void main(String[] args) {
		printMyName();		

		Ticket[] a = { new Ticket(5), new Ticket(3), new Ticket(10), new Ticket(7), new Ticket(4) };
		
		System.out.println(countGT(a, a[4]));
	}
}
