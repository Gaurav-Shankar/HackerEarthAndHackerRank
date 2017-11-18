import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Scanner;


public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println((double)a%b);
		}
	}
}
