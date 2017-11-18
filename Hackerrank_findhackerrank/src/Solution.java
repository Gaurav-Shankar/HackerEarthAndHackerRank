import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int j=0;
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for(int i=0;i<N;i++){
			arr[i] = br.readLine();
		}
		for(int i=0;i<N;i++){
			String[] arr1 = arr[i].split(" ");
			for(int k=0;k<arr1.length;k++){
				arr1[k].trim();
			}
			int x = arr1.length-1;
			if(arr.length == 1 && arr[0].equalsIgnoreCase("hackerrank")){
				System.out.println("0");
			}
			else if(arr1[j].equalsIgnoreCase("hackerrank") && arr1[x].equalsIgnoreCase("hackerrank")){
				System.out.println("0");
			}
			else if(arr1[j].equalsIgnoreCase("hackerrank")){
				System.out.println("1");
			}
			else if(arr1[x].equalsIgnoreCase("hackerrank")){
				System.out.println("2");
			}

			else{
				System.out.println("-1");
			}
			arr1 = null;



		}
	}

}
