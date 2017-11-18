import java.util.Scanner;


public class Solution{
	static boolean is(long i){
		if(i<=0){
			return false;
		}
		else  if((i &(i-1)) == 0){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int T =  sc.nextInt();
		for(int i=0;i<T;i++){
			long N = sc.nextLong();
			if(is(N)){
			System.out.print("Hi there");
			}
		}

	}
} 