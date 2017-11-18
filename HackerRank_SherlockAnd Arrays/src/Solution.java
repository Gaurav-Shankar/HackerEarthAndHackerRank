import java.util.Scanner;


public class Solution {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	int[] arr;
	while(T-- >0){
		boolean flag = false;
		int keysum = 0,sum=0;
		int N = sc.nextInt();
		arr = new int[N];
		for(int i=0;i<N;i++){
			arr[i] = sc.nextInt();
			keysum  = keysum + arr[i];
		}
		
		for(int i=0;i<N;i++){
			sum = sum+arr[i];
			if(sum == (keysum-sum-arr[i])){
				flag = true;
				break;
			}
			else{
				flag = false;
				continue;
			}
		}
		if(flag){
			System.out.println("NO");
		}
		else{
			System.out.println("YES");
		}
		
		
	}
}
}
