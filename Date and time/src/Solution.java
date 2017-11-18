import java.util.Calendar;
import java.util.Date;


public class Solution {
public static void main(String[] args) {
	Date d1 = new Date();
	Calendar cl = Calendar.getInstance();
	Date dtt = cl.getTime();
	int dt = cl.get(Calendar.AM_PM);
	System.out.println(dtt);
	System.out.println(dt);
	
	}
}
