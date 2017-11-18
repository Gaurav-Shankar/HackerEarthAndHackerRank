
import java.util.Scanner;
public class Solution {
	static long luckyNumbers(long a,long b) {
		long count = 0;
		boolean res =false;
		for(long i=a;i<=b;i++){
			long number = i;
			if(isPrime(i)){
				String d = Integer.toString((int) i);
				for(int l=0;l<d.length();l++){
					if(d.charAt(l) == '1'){
						res = false;
						break;
					}
					else
						res  = true;
				}
				if(res){
					count++;
				}
			}

			
		}
		return count;
	}

	static boolean isPrime(long a){
		if(a==1){
			return false;
		}
		for(long i=2;i*i<=a;i++){
			if(a%i == 0){
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long res;
		int _a_size = in.nextInt();
		long a,b;
		for(int _a_i = 0; _a_i < _a_size; _a_i++) {
			a = in.nextLong();
			b = in.nextLong();
			res = luckyNumbers(a,b);
			System.out.println(res);

		}
	}
}