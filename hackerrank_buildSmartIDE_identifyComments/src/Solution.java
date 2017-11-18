import java.io.BufferedReader;

import java.io.InputStreamReader;


public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		for(int i=0;str!=null;i++){
			
			str = br.readLine();
			if(str == null){
				break;
			}
			if(str.contains("//")){
				String[] str1 = str.split("//");
				System.out.println("//" + str1[1]);
			}
			else if(str.contains("/*") && (str.contains("*/"))){
			System.out.println(str);	
			}
			else if(str.contains("/*") && str.contains("*/") == false){
				System.out.println(str);
				String str2 = str;
				for(int t=0;str2.contains("*/") == false;i++){
					
					str2 = br.readLine();
					System.out.println(str2);
				}
			}
		}
	}
}
