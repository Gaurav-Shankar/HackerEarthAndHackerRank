/*
 * Anotther and a more effective solution to determine if a number is in fibo series or not..
 * import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static HashSet<Long> fibs = new HashSet();
    public static void main(String[] args) {
        long max = 10000000000l;
        long a = 1, b = 1, c;
        fibs.add(0l);
        fibs.add(1l);
        do{
            c = a+b;
            fibs.add(c);
            a = b;
            b = c;
        }while(c <= max);
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) System.out.println(isFib(in.nextLong()));
    }
    
    private static String isFib(long n){
        return fibs.contains(n)? "IsFibo":"IsNotFibo";
    }
}
 */
import java.util.Scanner;


public class Solution {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long[] arr = {0,
			1,
			1,
			2,
			3,
			5,
			8,
			13,
			21,
			34,
			55,
			89,
			144,
			233,
			377,
			610,
			987,
			1597,
			2584,
			4181,
			6765,
			10946,
			17711,
			28657,
			46368,
			75025,
			121393,
			196418,
			317811,
			514229,
			832040,
			1346269,
			2178309,
			3524578,
			5702887,
			9227465,
			14930352,
			24157817,
			39088169,
			63245986,
			102334155,
			165580141,
			267914296,
			433494437,
			701408733,
			1134903170,
			1836311903};
	long T = sc.nextLong();
	for(int i=0;i<T;i++){
		boolean res = false;
		long N = sc.nextLong();
		for(int j=0;j<arr.length;j++){
			if(N == arr[j]){
				res = true;
				break;
			}
			else{
				res = false;
				continue;
			}
		}
		if(res == false){
			System.out.println("IsNotFibo");
		}
		else{
			System.out.println("IsFibo");
		}
	}
	
}
}







