package epiccode_5;

import java.util.Scanner;

public class Solution {
	public static int[] buildFenwickTree(int[] A){
        int[] fenwickTree = new int[A.length];

        for (int i = 1; i <= A.length; i++) {
            int idx=i;
            do{
                fenwickTree[idx-1] += A[i-1];
                idx += (idx & -idx);
            }while (idx <= A.length && idx>0);
        }
        return fenwickTree;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long[] arr = new long[(int)N];
		long Q = sc.nextLong();
		long q,x,y;
		StringBuffer s = new StringBuffer();
		for(long i=0;i<Q;i++){
		long sum=0;
			q = sc.nextLong();
			x = sc.nextLong();
			y = sc.nextLong();
			if(q == 1){
				long k=1;
				for(long j=x-1;j<y;j++){
					arr[(int) j] = arr[(int) j]+k*(k+1);
					k++;
				}
			}
			else if(q == 2){
				for(long j=x-1;j<y;j++){
					sum = (sum + arr[(int) j]);
				}
				sum = sum % 1000000007;
				s.append(sum);
				s.append("\n");
			}
		}
		System.out.println(s);
		sc.close();
	}
}
