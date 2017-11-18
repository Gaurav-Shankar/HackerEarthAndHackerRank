import java.util.Scanner;


public class TestClass {
	public static int getGdc(int... x) {
		// get the smallest of all number no need to check for higher values
		int smallest = getSmallest(x);
		
		for(int i = smallest; i >= 1; i--) {
		   int j;
		   for(j = 0; j < x.length; ++j) {
			   if(x[j] % i != 0)
				   break;
		   }
		   // if we pass through the array with all % == 0 return the value
		   if(j == x.length)
			   return i;
		}
		// so the only possible is 1
		return 1;
	}
	public static int getSmallest(int[] x) {
		int smallest = x[0];
		for(int i = 1; i < x.length; ++i) {
			if(x[i] < smallest)
				smallest = x[i];
		}
		return smallest;
	}
	public static int getmul(int[] a){
		int mul=1;
		for(int i=0;i<a.length;i++){
			mul = mul * a[i];
		}
		return mul;

	}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int arr[] = new int[N];
	for(int i=0;i<N;i++){
		arr[i] = sc.nextInt();
	}
	int res = getSmallest(arr);
	int res1 = getGdc(res);
	int mul = getmul(arr);
	int result = ((int) Math.pow(mul,res1)) % (1000000007);
	System.out.println(result);
}
}
