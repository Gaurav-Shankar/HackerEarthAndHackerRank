import java.util.ArrayList;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long Xarr[] = new long[(int) N];
		long Yarr[] = new long[(int) N];
		ArrayList<Long> ar = new ArrayList<Long>();
		boolean res = false;
		for(long i=0;i<N;i++){
			Xarr[(int) i] = sc.nextLong();
			Yarr[(int) i] = sc.nextLong();
		}
		for(long i=0;i<N;i++){
			for(long j=0;j<N;j++){
				if(i == j){
					continue;
				}
				if(Xarr[(int) i] <= Xarr[(int) j] && Yarr[(int) i] >= Yarr[(int) j]){
					res = false;
					break;
				}
				else{
					res = true;
					continue;
				}
			}
			if(res){
				ar.add(Xarr[(int) i]);
			}

		}
		System.out.println(ar.size());
		sc.close();
	}
}
