import java.util.Scanner;

import javax.crypto.KeyAgreement;
public class TestClass {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int Q = sc.nextInt();
		for(int i=0;i<Q;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int len = str.length();
	        while(str.length()<b){
	        	str = str + str;
	        }
	       
	        if(str.charAt(a-1) == str.charAt(b-1)){
	        	System.out.println("YES");
	        }
	        else{
	        	System.out.println("NO");
	        }
		}
	}
}