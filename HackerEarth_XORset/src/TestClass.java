import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class TestClass {
	static void MaxReps(int[] ar){
		int countr=0,max=0;
		for(int i=0;i<ar.length;i++){
			countr=0;
			for(int j=0;j<ar.length;j++){
				if(ar[i] == ar[j])
					countr++;
			}
			if(countr > max)
				max = countr;
		}
		System.out.println(max);
		
	}
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] op = new int[(N*(N+1)) / 2];
 		for(int i=0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		int l=0;
		int res;
		for(int i=0;i<N;i++){
			res = arr[i];
			op[l] = res;
			l++;
			for(int j=i+1;j<N;j++){
				res = res ^ arr[j];
				op[l] = res;
				l++;
			}
		}
		Arrays.sort(op);
		MaxReps(op);
		sc.close();
		
		
	}
}
