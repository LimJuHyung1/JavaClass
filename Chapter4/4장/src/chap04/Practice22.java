class Line{
	int length;
	
	public Line(int l) {
		this.length = l;
	}
	
	public boolean isSameLine(Line l) {
		return this.length == l.length ? true : false;		
	}	
}

public class Practice22 {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}	
	
	public static void main(String[] args) {
		printMyName();
		
		Line a = new Line(1);
		Line b = new Line(1);
		
		System.out.println(a.isSameLine(b));
		System.out.println(a == b);		
	}
}
