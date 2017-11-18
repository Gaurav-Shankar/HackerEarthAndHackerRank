import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int j=0;j<T;j++){
			boolean flag = false;
			String s = sc.nextLine();
			StringBuffer sb = new StringBuffer(s);
			StringBuffer r = sb.reverse();
			for(int i=1;i<s.length()-1;i++){
				System.out.println("i am here");
				if(s.charAt(i) - s.charAt(i-1) == r.charAt(i) - r.charAt(i-1)){
					flag = true;
				}
			}
			if(flag){
				System.out.println("Funny");
			}
			else{
				System.out.println("Not Funny");
			}
		}
	}
}
