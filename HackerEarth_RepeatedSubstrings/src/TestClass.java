import java.util.Arrays;
import java.util.Scanner;


public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String str;
		boolean flag;
		for(int i=0;i<T;i++){
			flag = false;
			str = sc.next();
			char ch[] = str.toCharArray();
			for(int j=0;j<ch.length;j++){
				for(int l=j+1;l<ch.length;l++){
				if(ch[j] == ch[l]){
					flag = true;
					break;
				}
				
				}
				if (flag)
					break;
			}
			if(flag){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}
