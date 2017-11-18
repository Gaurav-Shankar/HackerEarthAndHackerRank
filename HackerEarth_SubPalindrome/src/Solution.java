import java.util.Scanner;
class Solution {
	static boolean isPalindrome(String str){
		String rev = new StringBuffer(str).reverse().toString();
		if(rev.equalsIgnoreCase(str)){
			return true;
		}
		else	
			return false;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String s1 = sc.nextLine();
		int count;
		for(int i=0;i<T;i++){
			s1 = sc.nextLine();
			count = 0;
			String temp;
			for(int j=0;j<s1.length();j++){
				for(int k=j+1;k<=s1.length();k++){
					if(isPalindrome(s1.substring(j,k))){
						count++;
					}
				}
			}
			System.out.println(count);
			
		}
	}
}
