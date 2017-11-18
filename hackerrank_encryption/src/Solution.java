import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line  = br.readLine();
		line = line.replace(" ", "");
		String res = "";
		int rows,columns;
		int len = line.length();
		int width = (int) Math.floor(Math.sqrt(len));
		int height = (int) Math.ceil(Math.sqrt(len));
		if(width>height){
			rows = height;
			if(width*width > width * height){
				columns =width;
			}
			else{
				columns = height;
			}
		}
		else{
			rows = width;
			if(height*height > width * height){
				columns = height;
			}
			else{
				columns = width;
			}
		}
		for(int k=1;k<=columns;k++){
			int j=k;
			while(j<=len){
				res = res + line.charAt(j-1);
				j = j + columns;
			}
			res = res + " ";
		}
		System.out.println(res);
	}
}
