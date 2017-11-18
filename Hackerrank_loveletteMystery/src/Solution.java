import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Solution {
public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(br.readLine());
	for(int j=0;jsf<T;j++){
		int counter =0;
		String str = br.readLine();
		for(int i=0;i<str.length()/2;i++){
			//System.out.println(i);
			counter = counter + Math.abs((str.charAt(i)-'0' - (str.charAt(str.length()-i-1)-'0')));
		}
		System.out.println(counter);
	}
}
}
