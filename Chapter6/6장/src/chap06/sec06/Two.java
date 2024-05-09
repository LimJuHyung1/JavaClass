package sec06;

public class Two {
	public void print() {
		One o = new One();
		// System.out.println("private : " + o.secret);
		System.out.println("default : " + o.roommate);
		System.out.println("protected : " + o.child);
		System.out.println("public : " + o.anybody);
	}
}
