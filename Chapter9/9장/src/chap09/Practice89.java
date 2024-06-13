
public class Practice89 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();		

		Reso reso = new Reso();

        try (reso) {
            reso.show();
        } catch (Exception e) {
            System.out.println("예외 처리");
        }		
	}
}

class Reso implements AutoCloseable {
    void show() {
        System.out.println("자원 사용");
    }

    public void close() throws Exception {
        System.out.println("자원 닫기");
    }
}

