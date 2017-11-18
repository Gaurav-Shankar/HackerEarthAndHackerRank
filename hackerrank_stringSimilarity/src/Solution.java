import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++){
			String s1  =br.readLine();
			long count = s1.length();
			char[] sa = s1.toCharArray();
			String[] sub  = new String[s1.length()];
			for(long j=0;j<s1.length();j++){
				sub[(int) j] =  s1.substring((int) j);
			}
			for(long j=1;j<sub.length;j++){
				char[] sa1 = sub[(int) j].toCharArray();
				for(long k=0;k<sa1.length;k++){
					if(sa[(int) k] == sa1[(int) k]){
						count++;
						continue;
					}
					else{
						break;
					}
				}
			}
			System.out.println(count);
		}
	}
}

