import java.util.Scanner;
public class Solution {

	static int cycle1(int x){
		return 2*x;
	}
	static int cycle2(int x){
		return x+1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0){
			int x=1;
			int cycles = sc.nextInt();
			if(cycles == 0){
				System.out.println(x);
				continue;
			}
			for(int i=1;i<=cycles;i++){
				if(i == 1){
					x = cycle1(x);
					continue;
				}
				if(i%2 != 0){
					x =  cycle1(x);
				}
				if(i%2 == 0){
					x = cycle2(x);
				}
			}
			System.out.println(x);
		}
	}
}
