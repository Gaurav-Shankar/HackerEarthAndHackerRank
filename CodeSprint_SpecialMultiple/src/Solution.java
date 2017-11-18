import java.io.*;
public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++){
			boolean res = false;
			int n = Integer.parseInt(br.readLine());
			int j=1;
			while(true){
				int temp = n * j;
				int temp1 = temp;
				int q = 0;
				while(temp != 0){
					q = temp % 10;
					temp = temp / 10;
					if(q == 9 || q == 0){
						res = true;
					}
					else{
						res = false;
						break;
					}
				}
				if(res){
					System.out.println(temp1);
					break;
				}
				else{
					j++;
				}
			}
		}
	}
}
