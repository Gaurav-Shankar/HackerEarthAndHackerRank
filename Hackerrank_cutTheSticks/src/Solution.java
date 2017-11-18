import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;

		int N = sc.nextInt();
		int sticks[] = new int[N];
		int temp[] = new int[N];
		for(int i=0;i<N;i++){
			sticks[i] = sc.nextInt();
			temp[i] = sticks[i];
		}
		Arrays.sort(sticks);
		for(int j=0;j<temp.length;j++){
			for(int i=0;i<temp.length;i++){
				temp[i] = temp[i] - sticks[j];
				count++;
				if(temp[i] == 0){
					temp[i] = temp[i+1]; 
				}
				
			}
			System.out.println(count);
		}



	}
}
