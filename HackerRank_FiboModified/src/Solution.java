import java.math.BigInteger;
import java.util.Scanner;
public class Solution {
	static long solver(BigInteger a, BigInteger b, long n){
		long termcount = 3;
		while(termcount <= n){
			BigInteger temp = b;
			b = (b.multiply(b)).add(a);
			a = temp;
			termcount++;
		}
		System.out.println(b);
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger A = BigInteger.valueOf(sc.nextLong());
		BigInteger B = BigInteger.valueOf(sc.nextLong());
		long N = sc.nextLong();
		solver(A,B,N);
	}
}
