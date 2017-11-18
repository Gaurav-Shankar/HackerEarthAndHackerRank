import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TestCases = sc.nextInt();
		for(int i=0;i<TestCases;i++){
			boolean res = false;
			int NoOfElements = sc.nextInt();
			long Sum = sc.nextLong();
			long[] A = new long[NoOfElements];
			for(long j=0;j<A.length;j++){
				A[(int) j] = sc.nextLong();
			}
			long[] B = new long[NoOfElements];
			for(long j=0;j<B.length;j++){
				B[(int) j] = sc.nextLong();
			}
			for(long k=0;k<NoOfElements;k++){
				for(long l=0;l<NoOfElements;l++){
					if(A[(int) k] + B[(int) l] == Sum || A[(int) k] + B[(int) l] > Sum){
						A[(int) k] = 0;
						B[(int) l] = 0;
						res = true;
						break;
					}
					else{
						res = false;
						continue;
					}
				}
				if(res){
					continue;
				}
				else{
					System.out.println("NO");
					break;
				}
			}
			if(res){
				System.out.println("YES");
			}
		}
	}
}
