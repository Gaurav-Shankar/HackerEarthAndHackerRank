import java.util.ArrayList;
import java.util.Scanner;


public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String s1; 
		for(int i=0;i<T;i++){
			s1 = sc.next();
			int j=0;
			while(j < s1.length()-1){
				if(s1.charAt(j) == s1.charAt(j+1)){
					s1 = s1.substring(0, j)+s1.substring(j+1);
					j=0;
				}
				else{
					j++;
				}
				
			}
			System.out.println(s1);
			
		}
	}
}
