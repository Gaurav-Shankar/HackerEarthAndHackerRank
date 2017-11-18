import java.util.Scanner;


public class TestClass {
	public static boolean checkPalindrome(String input)
    {
        int [] count = new int[26];
        for( int i = 0; i < input.length(); i++ )
        {
            char ch = input.charAt(i);
            count[ch-'a']++;
        }
        int oddOccur = 0;
        for( int cnt:count )
        {
            if( oddOccur > 1)
                return false;
            if( cnt%2 == 1 )
                oddOccur++;
        }
        return true;
    }

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	if(checkPalindrome(str)){
		System.out.println("YES");
	}
	else{
		System.out.println("NO");
	}
	sc.close();
}
}
