import java.util.Scanner;
public class TestClass {
	static int calcSum(int n){
		int sum;
		for(sum=0; n > 0; sum+=n%10,n/=10);

		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,M;	
		int sum1=0,sum2=0;
		String s1,s1h,s1oh;
		int num1,num2;
		N = sc.nextInt();
		for(int i=0;i<N;i++){
			s1="";
			s1h="";
			s1oh="";
			num1=0;
			num2=0;
			sum1=0;
			sum2=0;
			M = sc.nextInt();
			s1 = Integer.toString(M);
			s1h = s1.substring(0, s1.length()/2);
			s1oh = s1.substring(s1.length()/2);
			num1 = Integer.parseInt(s1h);
			num2 = Integer.parseInt(s1oh);
			sum1 = calcSum(num1);
			sum2 = calcSum(num2);
			if(sum1 == sum2){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
