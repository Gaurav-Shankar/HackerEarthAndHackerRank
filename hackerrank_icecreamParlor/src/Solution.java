import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for(int i=0;i<T;i++){
		boolean res = false;
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[] price = new int[N];
		for(int j=0;j<N;j++){
			price[j] = sc.nextInt();
		}
		for(int i1=0;i1<N;i1++){
			for(int j=i1+1;j<N;j++){
				if(price[i1] + price[j] == M){
					res = true;
					if(i1>j)
					System.out.println((j+1)+" "+ (i1+1));
					else
					System.out.println((i1+1)+" "+ (j+1));
					break;
				}
				if(res == true){
					break;
				}
				else{
					continue;
				}
				
			}
			
		}
	}
}
}
