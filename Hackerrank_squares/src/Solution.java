import java.util.Scanner;


public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0;i<t;i++){
			int count=0;
			long A = sc.nextLong();
			long B = sc.nextLong();

			for(long i1=A;i1<=B;i1++){
				int a = (int) Math.sqrt(i1);
				if(a * a == i1){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
