import java.util.Scanner;


public class Solution {
	static int CalculateMaxArea(int n){
		if(n%4 == 0 || n%4 == 1)
			return (n/4)*(n/4);
		else
			return (n/4)*((n/4)+1);

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			int cas = sc.nextInt();
			System.out.println(CalculateMaxArea(cas)); 
		}
	}
}
