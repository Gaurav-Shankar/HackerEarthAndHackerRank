import java.util.Scanner;


public class TestClass {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	int A,B,C,K;
	for(int i=0;i<T;i++){
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		K = sc.nextInt();
		int l = K-C;
		for(int j=0;j<l;j++){
			if(A*(j*j) + B*j  >= l){
				System.out.println(j);
				break;
			}
		}
	}
}
}
