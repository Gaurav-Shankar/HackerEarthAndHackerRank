import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean x = true;
		for (int a = 0; a < 15; a++){
			String temp =br.readLine();
			if(temp.contains("java")){
				System.out.println("Java");
				x = false;
				break;
			}
			else if(temp.contains("stdio")){
				System.out.println("C");
				x = false;
				break;
			}

		}
		if(x){
			System.out.println("Python");
		}
	}
}
