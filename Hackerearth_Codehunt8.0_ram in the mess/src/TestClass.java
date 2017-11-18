import java.util.Scanner;


public class TestClass {
	 static int fib(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
 
        return fib(n - 1) + fib(n - 2);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		int res;
		for(int i=0;i<T;i++){
			N = sc.nextInt();
			res = fib(N+3);
			System.out.println(res*res);
		}
	}
}
