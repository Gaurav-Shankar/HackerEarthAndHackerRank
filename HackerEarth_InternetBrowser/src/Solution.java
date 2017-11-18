import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Solution {
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		char[] vowels = {'a','e','i','o','u'};
		String s1;
		for(int i=0;i<T;i++){
			s1 = br.readLine();
			String s2 = s1.substring(4, s1.length()-4);
			int count = 0;
			for(int j=0;j<s2.length();j++){
				for(int l=0;l<vowels.length;l++){
					if(s2.charAt(j) == vowels[l]){
						count ++;
					}
				}
			}
			System.out.println(s1.length()-(count + 4) +"/"+ s1.length());
		}
	}
}
