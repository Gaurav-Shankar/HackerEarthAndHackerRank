import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N,K;
		N = sc.nextLong();
		K = sc.nextLong();
		ArrayList< Long> ar = new ArrayList<Long>();
		ArrayList< Long> ar1 = new ArrayList<Long>();
		for(int i=0;i<N;i++){
			ar.add(sc.nextLong());
		}
		for(int i=0;i<N;i++){
			ar1.add(sc.nextLong());
		}
		long count=0;
		Collections.sort(ar);
		Collections.sort(ar1);
		long i = 0,j = 0;
		while(i < ar.size()){
			while(j<ar.size()){
				if(Math.max(ar.get((int) i), ar1.get((int) j)) - Math.min(ar.get((int) i), ar1.get((int) j)) <= K){
					count++;
					ar.remove(ar.get((int) i));
					ar1.remove(ar1.get((int) j));
					i=0;
					j=0;
					//System.out.println(ar);
				//	System.out.println(ar1);
				}
				else{
					j=j+1;
				}
			}
			i=i+1;
			j = 0;
			
		}

		System.out.println(count);
		sc.close();

	}
}
