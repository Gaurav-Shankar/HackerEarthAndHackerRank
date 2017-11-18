import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		long N = ac.nextLong();
		long K = ac.nextLong();
		long k =0;
		long counter = 0;
		boolean res = false;
		long[] unfrnd = new long[(int) N];
		long[] div = new long[(int) K];
	    for(long i=0;i<N;i++){
			unfrnd[(int) i] = ac.nextLong();
		}
		for(long i=1;i<=K;i++){
			if(K%i == 0){
			div[(int) k] = i;
			k++;
			}
			else{
				continue;
			}
		}
		for(long i=0;div[(int) i]!=0;i++){
			for(long j=0;j<N;j++){
				if(unfrnd[(int) j]%div[(int) i] == 0){
					res = false;
					break;
				}
				else{
					res = true;
					continue;
				}
			}  
			if(res){
				counter++;
			}
			else{
				continue;
			}
		}
		System.out.println(counter);
		
	}
}