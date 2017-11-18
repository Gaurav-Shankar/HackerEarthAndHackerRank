import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.SortedMap;


public class Solution {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long n,p,x;
	n = sc.nextLong();
	p = sc.nextLong();
	x = sc.nextLong();
	long[] arr = new long[(int) n];
	for(int i=0;i<n;i++){
		long num = sc.nextLong();
		arr[i] = num * p;
		p = p-x;
	}
	long largest = arr[0], index = 0;
	for (long i = 1; i < arr.length; i++) {
	  if ( arr[(int) i] > largest ) {
	      largest = arr[(int) i];
	      index = i;
	   }
	}
	System.out.println(index+1);
	
}
}
