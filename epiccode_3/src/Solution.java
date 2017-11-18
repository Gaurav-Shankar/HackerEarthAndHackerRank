import java.util.Scanner;


public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long arr[]  = new long[(int) N];
		for(int i=0;i<N;i++){
			arr[i] = sc.nextLong();
		}
		long val = 0;
		long maxval=0;
		for(long i=0;i<N-3;i++){
			for(long j=i+4;j<N-3;j++){
				val = arr[(int) i]*arr[(int) (j+3)] + arr[(int) (i+1)]*arr[(int) (j+2)] + arr[(int) (i+2)]*arr[(int) (j+1)] + arr[(int) (i+3)]*arr[(int) j];
			//	System.out.println(val);
			}
			if(val > maxval)
				maxval = val;
		}
			
			System.out.println(maxval);
			sc.close();
		}
		
	}
	


