import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
public class Solution {


	static String numberMap(String n){
		HashMap<String,String> h1 = new HashMap<String,String>();
		h1.put("0", "Zero");
		h1.put("1", "One");
		h1.put("2", "Two");
		h1.put("3", "Three");
		h1.put("4", "Four");
		h1.put("5", "Five");
		h1.put("6", "Six");
		h1.put("7", "Seven");
		h1.put("8", "Eight");
		h1.put("9", "Nine");
		return h1.get(n);
	}
	static void toWords(String str){
		if(str.length() == 1){
			System.out.println(numberMap(str));
		}
		if(str.length() == 2){
			
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		toWords(str);

	}
}