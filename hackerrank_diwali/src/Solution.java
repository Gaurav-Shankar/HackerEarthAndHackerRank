import java.util.Scanner;
/*  ===========================Wrong solution==================================*/

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int[] lights = new int[cases];
		for(int i=0;i<cases;i++){
			lights[i] = sc.nextInt();
		}
		for(int i=0;i<cases;i++){
			double in = Math.pow(i, 2);
			System.out.println(in);
			int ways = (int) (in-1);
			System.out.println(ways);
		}
	}
}
