public class Practice12 {
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}
	
    public static void main(String[] args) {
    	printMyName();
    	
        whoIsIt("호랑이");
        whoIsIt("참새");
        whoIsIt("고등어");
        whoIsIt("도마뱀");
        whoIsIt("곰팡이");        
    }

    static void whoIsIt(String bio) {
        String kind = "...";
        // ->로 인해 break; 선언 할 필요가 없음
        switch (bio) {
            case "호랑이", "사자" -> kind = "포유류";
            case "독수리", "참새" -> kind = "조류";
            case "고등어", "연어" -> kind = "어류";
            case "도마뱀", "뱀" -> kind = "파충류";
            default -> System.out.print("어이쿠! ");
        }
        System.out.printf("%s는 %s이다.\n", bio, kind);
    }
}
