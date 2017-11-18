import java.util.Scanner;


public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int size = sc.nextInt();
		int[] A = new int[size];
		for(int i=0;i<size;i++){
			A[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++){
			if(A[i]==val){
				System.out.println(i);
				break;
			}
			else{
				continue;
			}
			
		}
	}

}
