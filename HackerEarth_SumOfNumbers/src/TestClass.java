import java.util.Scanner;
import java.util.TreeSet;


public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int count;
		while (T-- > 0) {
			count = 1;
			int n = sc.nextInt();
			if(n%2 != 0){
				System.out.println("0");
			}
			else{
				int  u = (int) Math.floor(Math.sqrt(n));
				for(int i=2;i<=u;i++){
					count = (int) (count + Math.floor(n/i));
				}
				count = 2*count - u*u;
				System.out.println(count);
			}
		}
	}
}
