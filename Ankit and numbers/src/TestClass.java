import java.util.Scanner;
public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			int N = sc.nextInt();
			int sum = (N*(N+1));
			for(int j=1;j<=N;j++){
				for(int k=j+1;k<=N;k++){
					sum = sum + j + k;
				}
			}
			System.out.println(sum);
		}
	}
}
