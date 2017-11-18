import java.math.BigInteger;
import java.util.Scanner;


public class TestClass {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	int N;
	while(T-- > 0){
		N = sc.nextInt();
		int sq = ((N) * (N + 1) *(2*N + 1))/6 ;
		int rec = (N * (N + 1) * N * (N + 1));
		System.out.println(sq + "\n" + rec);
	}
}
}
