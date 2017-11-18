import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr;
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++){
			String s1 =  br.readLine();
			if(s1.contains("-")){
				arr = s1.split("-");
			}
			else{
				arr = s1.split(" ");
			}
			System.out.println("CountryCode="+arr[0]+",LocalAreaCode="+arr[1]+",Number="+arr[2]);
		}
	}
}
