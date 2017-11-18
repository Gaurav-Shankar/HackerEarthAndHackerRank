/*
 * 
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			int count =0;
			boolean res = false;
			int n = sc.nextInt();
			int m =sc.nextInt();
			int[] mval = new int[m];
			for(int j=0;j<m;j++){
				mval[j] = sc.nextInt();
			}
			for(int k=1;k<=n;k++){
				for(int l=0;l<mval.length;l++){
					if(k%mval[l] == 0){
						res = true;
					}
					else{
						res = false;
						break;
					}
				}
				if(res)
					count++;
			}
			System.out.println(count);

		}

 */
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			int n = sc.nextInt();
			int m =sc.nextInt();
			int[] mval = new int[m];
			for(int j=0;j<m;j++){
				mval[j] = sc.nextInt();
			}
			if(mval.length == 1 && mval[0] ==1){
				System.out.println(1*n);
			}
			else
				System.out.println(mval.length -1);

		}
	}
}
