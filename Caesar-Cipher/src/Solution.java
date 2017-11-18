import java.util.Scanner;


public class Solution {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int L = sc.nextInt();
	String str = sc.next();
	int key = sc.nextInt();
	StringBuffer s = new StringBuffer();
	for(Character ch : str.toCharArray()){
		if(!Character.isAlphabetic(ch))
			s.append(ch);
		else{
			if(ch >= 65 && ch <= 65+26){
				char base = 'A';
				s.append((char)(((ch - base + key) % 26) + base));
			}
			else if(ch >= 97 && ch <=122){
				char base = 'a';
				s.append((char)(((ch - base + key) % 26) + base));	
			}
		}
		
	}
	System.out.println(s);
}
}
