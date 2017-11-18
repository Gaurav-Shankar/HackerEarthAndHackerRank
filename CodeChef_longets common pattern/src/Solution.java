import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

import com.sun.org.apache.bcel.internal.generic.LLOAD;


public class Solution {
public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int TestCases = Integer.parseInt(br.readLine());
	while(TestCases > 0){
		int ans = 0;
		String s1 = br.readLine();
		String s2 = br.readLine();
		LinkedList<Character> llone = new LinkedList<Character>();
		for(int i=0;i<s1.length();i++){
			llone.add(s1.charAt(i));
		}
		System.out.println(llone);
		LinkedList<Character> lltwo = new LinkedList<Character>();
		for(int i=0;i<s2.length();i++){
			llone.add(s2.charAt(i));
		}
		for(int i=1;i<=s1.length();i++){
			for(int j=1;j<=s2.length();j++){
				if(llone.get(i) == lltwo.get(j)){
					ans++;
				}
				else{
					continue;
				}
			}
		}
		System.out.println(ans);
		TestCases--;
	
	}
}
}
