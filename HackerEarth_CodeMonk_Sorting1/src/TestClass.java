import java.util.Arrays;
import java.util.Scanner;


public class TestClass {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	int N,x,y;
	int[] arr;
	for(int i=0;i<T;i++){
		int sum=0;
		float d;
		N = sc.nextInt();
		arr = new int[N];
		x = sc.nextInt();
		y = sc.nextInt();
		for(int j=0;j<arr.length;j++){
			arr[j] = sc.nextInt();
			sum = sum + arr[j];
		}
		d = (int) Math.sqrt(Math.pow((x-0), 2) + Math.pow(y-0, 2));
		//System.out.println(d);
		for(int j=0;j<N;j++){
			
		}
		if(d > sum){
			System.out.println("Not able");
		}
		
		
	}
}
}
