import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
public class Solution {
	public static void main(String[] args) throws  Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		Set<Character> char1 = null;
		for(int i=0;i<N-1;i++){
			String str1 = br.readLine();
			char[] ch = str.toCharArray();
			char[] ch1 = str1.toCharArray();
			char1 = new HashSet<Character>();
			Set<Character> char2 = new HashSet<Character>();
			for(char c:ch){
				char1.add(c);
			}
			for(char c:ch1){
				char2.add(c);
			}
			char1.retainAll(char2);
			str = str1;
		}
		System.out.println(char1.size());
	}
}
