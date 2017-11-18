import java.util.*;
class Solution{
	public static void main( String args[] ){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long[] arr = new long[(int) N];
		for(long i=0;i<N;i++){
			arr[(int) i] = sc.nextLong();
		}
		Arrays.sort(arr);
		System.out.println(arr[(int) (N/2)]);
	}
}