package sec06;

public class One {
	private int secret = 1;
	int roommate = 2;
	protected int child = 3;
	public int anybody = 4;

	public void show() {
		System.out.println("private : " + secret);
		System.out.println("default : " + roommate);
		System.out.println("protected : " + child);
		System.out.println("public : " + anybody);
	}
}