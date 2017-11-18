import java.util.ArrayList;
import java.util.Scanner;


public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		int[] d = {1,3,5,7};
		for(int i=0;i<T;i++) {
			N = sc.nextInt();
			 d = (int[]) (N - Math.pow(2, (Math.log(N))));
			System.out.println(2*d + 1);
		}
	}
}
