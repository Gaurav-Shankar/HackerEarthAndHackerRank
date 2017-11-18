import java.util.Arrays;
import java.util.Scanner;


public class Solution {
public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	int t = sc.nextInt();
	for(int i=0;i<t;i++){
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] price = new int[n];
		for(int j=0;j<n;j++){
			price[j] = sc.nextInt();
		}
		Arrays.sort(price);
		for(int j=0;j<n;j++){
			for(int z=1;z<n-1;z++){
				if(price[j] + price[z] == m){
					System.out.println(j+1  +" "+z+1);
					break;
				}
				break;
			}
		}
	}
}
}

