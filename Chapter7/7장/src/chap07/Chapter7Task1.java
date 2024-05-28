abstract class Controller{
	boolean power;
	void show() {
		if(power)
			System.out.println(getName() + "가 켜졌습니다.");
		else
			System.out.println(getName() + "가 꺼졌습니다.");
	}
	
	abstract String getName();
}

class TV extends Controller{
	TV(boolean isOn){
		this.power = isOn;
	}
	
	String getName() {
		return "TV";
	}
}

class Radio extends Controller{
	Radio(boolean isOn){
		this.power = isOn;
	}
	
	String getName() {
		return "라디오";
	}
}

public class Chapter7Task1 {

	public static void main(String[] args) {
		Controller[] c = {new TV(false), new Radio(true)};
		
		for(Controller controller : c) {
			controller.show();
		}
	}
}
