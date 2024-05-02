
public class Practice36{
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}		
	
    public static void main(String[] args) {
    	printMyName();    	
    	
    	for(Champion c : Champion.values()) {
    		String s = switch(c) {
    			case Top -> "탑신병자";
    			case Jungle -> "백정";
    			case Mid -> "황족";
    			case MM -> "숟가락";
    			case Sup -> "도구";
    		};
    		
    		System.out.println(c.toString()+ "는 " + s + "이다.");
    	}        
    }
    
    enum Champion{
    	Top("오른"), Jungle("뽀삐"), Mid("제드"), MM("진"), Sup("바드");
    	
    	private String s;
    	
    	Champion(String s){
    		this.s = s;
    	}
    	
    	public String toString() {
            return s;
        }
    }
}
