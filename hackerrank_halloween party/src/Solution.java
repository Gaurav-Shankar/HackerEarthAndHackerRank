import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			long N = sc.nextLong();
			if(N%2 == 0){
				System.out.println(N/2 * N/2);
			}
			else{
				System.out.println(N/2*(N/2+1));
			}
		}
	}
}
