
public class Practice25{
	public static void printMyName() {
		System.out.println("-----------------");
		System.out.println("2019305061 임주형");
		System.out.println("-----------------");
	}	
	
    public static void main(String[] args) {
    	printMyName();
    	
        String html1 = """ 
             <html>
                <p>Hi, world!</p>
             </html> 
             """;
        System.out.println(html1);
        //------------------------------------//
        String html2 = """ 
             <html>
                <p>Hi, world!</p>
             </html> 
        """;
        System.out.println(html2);
        //------------------------------------//
        String escape = """
                \\""";
        System.out.println(escape);
        //------------------------------------//
        System.out.println();
        //------------------------------------//
        String quote = "안녕, \"수정아!\"";
        /*String quote = """
                안녕, "수정아!"
                """;*/
        System.out.println(quote);
        //------------------------------------//
        String op = """
                가나라""".replace("라", "다");
        System.out.println(op);
    }
}
