import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int M=0,N=0;
		ArrayList<Integer > girls ;
		ArrayList<Integer > boys;
		int count;
		boolean flag;
		for(int i=0;i<T;i++){
			count = 0;
			flag = false;
			M = sc.nextInt();
			N = sc.nextInt();
			boys = new ArrayList<Integer>(M);
			girls = new ArrayList<Integer>(N);
			for(int j=0;j<M;j++){
				boys.add(sc.nextInt());
			}
			for(int k=0;k<M;k++){
				girls.add(sc.nextInt());
			}
			Collections.sort(boys);
			Collections.sort(girls);
			for(int j=0;j<boys.size();j++){
				for(int k=0;k<girls.size();k++){
					if(boys.get(j) > girls.get(k)){
						count++;
						boys.remove(j);
						girls.remove(k);
						break;
					}
					else{
						continue;
					}

				}
			}
			if(count == boys.size()){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}
