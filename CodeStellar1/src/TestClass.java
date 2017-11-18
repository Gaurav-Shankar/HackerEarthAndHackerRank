import java.util.Arrays;
import java.util.Scanner;
public class TestClass {
	static boolean solve(int arr[], int n){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] + arr[j] == n){
					return true;
				}
			}
		}

		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int arr[] = new int[N];
		for(int i=0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		StringBuffer s = new StringBuffer();
		int q = sc.nextInt();
		boolean flag=false;
		for(int i=0;i<q;i++){
			int query = sc.nextInt();
			System.out.println();
			if(Arrays.binarySearch(arr, query)>0){
				s.append("I Like You");
				s.append("\n");
				continue;
			}
			else{
				flag = solve(arr, query);
			}
			if(flag){
				s.append("I Like You");
				s.append("\n");
			}
			else{
				s.append("I Hate You");
				s.append("\n");
			}

		}
		System.out.println(s);
		sc.close();

	}
}
