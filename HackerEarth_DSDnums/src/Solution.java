import java.util.Calendar;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		String st = sc.next();
		String la = sc.next();
		String[] str = st.split(" ");
		calendar1.set(Integer.parseInt(str[0]), Integer.parseInt(str[1], Integer.parseInt(str[2])));
		str = la.split(" ");
		calendar2.set(Integer.parseInt(str[0]), Integer.parseInt(str[1], Integer.parseInt(str[2])));
		
		sc.close();
	}
}

