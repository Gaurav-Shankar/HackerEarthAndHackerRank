import java.util.Arrays;
import java.util.Scanner;
public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		StringBuilder s=new StringBuilder();
		for(int i=0;i<Q;i++){
			int num = sc.nextInt();

			if(Arrays.binarySearch(arr, num) <0)
				s.append("NO");
			else
				s.append("YES");
			s.append("\n");

		}
		System.out.println(s);

	}
}
