import java.util.Scanner;


public class Solution {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str =  sc.nextLine();
		if(str.contains("AM")){
			String st = str.replace("A", "");
			st = st.replace("M", "");
			String str1[] = st.split(":");
			if(str1[0].equals("12")){
				System.out.println("00"+":"+str1[1]+":"+str1[2]);
			}
			else{
			System.out.println(st);
			}
		}
		else{
			String st = str.replace("P", "");
			st = st.replace("M", "");
			String str1[] = st.split(":");
			if(str1[0].equals("12")){
				System.out.println(st);
			}
			else{
			String res = Integer.parseInt(str1[0])+12 + ":" + str1[1]+":"+str1[2];
			System.out.println(res);
			}
			
		}
	}
}
