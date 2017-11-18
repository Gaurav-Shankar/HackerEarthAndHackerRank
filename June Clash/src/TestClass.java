import java.util.Scanner;


public class TestClass {
	static int solve(int a,int b,int c,int d,int e){
		int count=0;
		for(int i=a;i<=b;i++){
			int res = calcSum(i);
			if(i%e == 0 && res>=c && res<=d){
				count++;
			}
		}
		return count;

	}
	static int calcSum(int n){
		int sum;
		for(sum=0; n > 0; sum+=n%10,n/=10);

		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B,X,Y,K;
		A = sc.nextInt();
		B = sc.nextInt();
		X = sc.nextInt();
		Y= sc.nextInt();
		K = sc.nextInt();
		System.out.println(solve(A, B, X, Y, K));
		sc.close();
	}
}
