import java.util.Scanner;


public class Solution {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextInt();
		int count =0;
		long[] arr = new long[N];
		for(int i=0;i<N;i++){
			arr[i] =  sc.nextLong();
		}
		for(int i=0;i<N;i++){
			for(int l=1;l<N;l++){
				if(arr[i] - arr[l] == K || arr[l] - arr[i] == K){
					count++;
				}
				else{
					continue;
				}
			}
		}
		System.out.println(count);
	}
}
