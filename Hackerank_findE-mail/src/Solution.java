/*
 * import java.awt.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.regex.Pattern;


public class Solution {
	public static void printList(ArrayList<String> list)
    {
        String result="";
        for(String email : list)
        {
            result+= email+";";
        }
        //remove the last semicolon
        result = result.substring(0,result.length()-1);
        System.out.println(result);
    }
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String arr[] = new String[N];
	String emai[] = new String[40];
	Patte

	ArrayList<String> ll = new ArrayList<String>();
		for(int i=0;i<N;i++){

			arr[i] = br.readLine();
			String[] arr1 = arr[i].split(" ");
			for(int k=0;k<arr1.length;k++){

				if(arr1[k].contains("@")){

					ll.add(arr1[k]);
					}
				else{
					continue;
				}
			}

		}
		Collections.sort(ll);
		//Removing the last semicolon
		printList(ll);









	}
}
 */
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	//for printing the email's separated by Semicolon
	public static void printList(ArrayList<String> list)
	{
		String result="";
		for(String email : list)
		{
			result+= email+";";
		}
		//remove the last semicolon
		result = result.substring(0,result.length()-1);
		System.out.println(result);
	}
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int no = sc.nextInt();
		while(no-- >= 0)
		{
			String word = sc.nextLine();
			if(!word.equals(""))
			{
				String emailPattern ="(\\b[a-z_.]{1,}@[a-z.]*[a-z]{1,3}\\b)";
				Pattern pattern = Pattern.compile(emailPattern,Pattern.CASE_INSENSITIVE);
				Matcher m = pattern.matcher(word);
				while(m.find())
				{
					String emailAddress = m.group(1);
					if(!list.contains(emailAddress))
						list.add(emailAddress);
				}

			}
		}
		//sorting for lexicographical order
		Collections.sort(list);
		//printing the result
		printList(list);
	}
}
