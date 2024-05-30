
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Practice79 {
	public static void printMyName() {
		System.out.println("------------------");
		System.out.println("2019305061 임주형");
		System.out.println("------------------\n");
	}	
	
	public static void main(String[] args) {
		printMyName();		

		Date d = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z");
        System.out.println(sdf1.format(d));

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

        try {
            d = sdf2.parse("2023-02-28");
        } catch (ParseException e) {
        }

        System.out.println(sdf1.format(d));

        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat sdf3 = new SimpleDateFormat("E yyyy.MM.dd", Locale.US);
        System.out.println(sdf3.format(calendar.getTime()));

        SimpleDateFormat sdf4 = new SimpleDateFormat("E yyyy.MM.dd", Locale.KOREA);
        System.out.println(sdf4.format(calendar.getTime()));
        
        SimpleDateFormat sdf5 = new SimpleDateFormat("현재시각 : HH시 mm분 ss초 SS밀리초");
        System.out.println(sdf5.format(calendar.getTime()));
	}
}