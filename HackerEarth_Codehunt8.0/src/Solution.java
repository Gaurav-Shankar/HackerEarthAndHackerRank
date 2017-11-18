import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] marks = new int[N];
		int maxsum = 0;
		for(int i=0;i<N;i++){
			marks[i] = sc.nextInt();
		}
		int maxsofar=0,maxendshere=0;
		for(int i=0;i<N;i++){
			maxendshere = maxendshere + marks[i];
			if(maxendshere < 0){
				maxendshere =0;
			}
			if(maxsofar < maxendshere){
				maxsofar = maxendshere;
			}
				
		}
		System.out.println(maxsofar);
		
		
	}
}
