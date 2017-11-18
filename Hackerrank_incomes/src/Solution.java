import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;


public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int incomes[] =new int[N];
		TreeSet< Integer> t = new TreeSet<Integer>();
		for(int i=0;i<N;i++){
			incomes[i] = sc.nextInt();
		}
		
		Arrays.sort(incomes);
		int count = 0;
		int Q = sc.nextInt();
		int query = sc.nextInt();
		int nextquery=0;
		for(int i=0;i<Q-1;i++){
			int j=0;
			while(j<incomes.length && incomes[j] < query){
				count++;
				j++;
			}
			 nextquery = sc.nextInt();
			if(nextquery > query){
				query = nextquery;
			}
			else{
				j=0;
				count=0;
			}
			System.out.println(count);
		}
	}
}
