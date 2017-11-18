import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		int maxval =0;
		for(int i=L;i<=R;i++){
			for(int j=i;j<=R;j++){
				int val = i^j;
				if(val>maxval)
					maxval = val;
			}
		}
		System.out.println(maxval);
	}
}
