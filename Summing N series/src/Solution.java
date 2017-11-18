/*
 * 
			BigInteger sum1 = new BigInteger("0");
			BigInteger n3 = new BigInteger("1000000009");
			long n = sc.nextInt();
			for(long j=1;j<=n;j++){
				BigInteger n1 = BigInteger.valueOf(j*2);
				BigInteger n2 = new BigInteger("1");
				BigInteger temp;
				temp = n1.subtract(n2);
				sum1 = sum1.add(temp);
			}
			sum1 = sum1.mod(n3);
			System.out.println(sum1);
		
 */

import java.math.BigInteger;
import java.util.Scanner;


public class Solution {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			long n = sc.nextLong();
			double n1 =  (n/2.0);
			long temp = ((2*1) + (n-1)*2);
			long sum =  (long) (n1 * temp);
			sum = sum % (1000000009L);
			System.out.println((long)sum);
		}
	}
}


/*
best solution in python

testcases = input()
for i in range(1,testcases+1):
    number = input()
    print pow(number,2,1000000007)

*/
