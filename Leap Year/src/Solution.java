public class Solution {
	float x;
	static int x1;
	 static String reverseMe(String s) {
		   if(s.length() == 0)
		     return "";
		   return s.charAt(s.length() - 1) + reverseMe(s.substring(0,s.length()-1));
		 }
	public static void main(String[] args) {
		String str = reverseMe("gaurav");
	//	str = str + str.charAt(3);
		Solution s = new Solution();
		Byte b  = Byte.parseByte(str);
		System.out.println(b);
		System.out.println(s.x1);
	}
}
