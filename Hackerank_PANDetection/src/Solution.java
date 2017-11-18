/*  ===================================THE PROBLEM==============================================
 * The equivalent of SSN in India is a PAN number, which is unique to each of its citizens. In any of the country’s official documents, the PAN number is listed as follows

<char><char><char><char><char><digit><digit><digit><digit><char>
Your task is to figure out if the PAN number is valid or not. A valid PAN number will have all its letters in uppercase and digits in the same order as listed above.

Input Format

First line contains N. N lines follow, each having a PAN number.

Constraints

1 <= N <= 10
Each char is an uppercase letter. Each digit lies between 0 and 9
The length of the PAN number is always 10
Every character in PAN is either char or digit satisfying the above constraints.

Output Format

For every PAN number listed, print YES if it is valid and NO if it isn’t.

Sample Input

3
ABCDS1234Y
ABAB12345Y
avCDS1234Y
Sample Output

YES
NO
NO
The first PAN number is valid since the first 5 characters are letters, the next 4 are digits and the last character is an alphabet with all the letters in uppercase.
The second PAN number is invalid as the fifth character is a digit as opposed to an letter.
The third PAN number contains lowercase characters. Hence invalid
 */
/*import java.io.*;
import java.lang.Character;
public class Solution {
	public static void main(String[] args) throws Exception, Exception {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean res = false;
		String[] pan = new String[N];
		for(int i=0;i<N;i++){
			pan[i] = br.readLine();
			pan[i].trim();
		}
		for(int i=0;i<N;i++){
			char[] ch = pan[i].toCharArray();
			for(int j=0;j<5;j++){
				if(Character.isUpperCase(ch[j])){
					res = true;
				}
				else{
					res = false;
					System.out.println("NO");
					break;
				}
			}
			if(res){
				for(int k=5;k<9;k++){
					if(Character.isDigit(ch[k])){
						res = true;
					}
					else{
						res = false;
						System.out.println("NO");
						break;
					}
				}
			}
			else{
				continue;
			}
			if(res){

				if(Character.isUpperCase(ch[9])){
					System.out.println("YES");
				}
				else{
					System.out.println("NO");
				}
			}
			else{
				continue;
			}

		}

	}
}
 */

// A more efficient solution to the problem!!

/*
 * Author : Gaurav Shankar
 */
import java.io.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) throws Exception, Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		while( N--  >=  0){
			String pan = br.readLine();
			if(pan.length() >10){
				System.out.println("NO");
				continue;
			}
			String PanPattern = "(\\b[A-Z]{1,5}[0-9]{1,4}[A-Z]{1}\\b)";
			Pattern p1 = Pattern.compile(PanPattern);
			Matcher m = p1.matcher(pan);
			if((m.find())){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
			
		}
		br.close();
		
	}
}