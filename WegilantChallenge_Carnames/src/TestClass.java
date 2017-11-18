import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class TestClass {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String str;
		boolean res;
		StringBuffer s = new StringBuffer();
		String pattern = "([a-zA-Z])\\1*";
		for(int i=0;i<T;i++){
			str = br.readLine();
			int N  = str.length();
			if(N%3==0){
				String s1 = str.substring(0, N/3);
				String s2 = str.substring(N/3, N*2/3);
				String s3 = str.substring(N*2/3, N);
				if( s1.matches(pattern) && s2.matches(pattern) && s3.matches(pattern)){
					s.append("OK");
					s.append("\n");
				}
				else{
					s.append("Not OK");
					s.append("\n");
				}
			}
			else{
				s.append("Not OK");
				s.append("\n");
			}
		}
		System.out.print(s);
	}
}
