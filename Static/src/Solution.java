import java.util.HashMap;
import java.util.Scanner;


public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		HashMap<Integer, Integer> hm = new HashMap<>(n);
		for(int i=0;i<n;i++){
			hm.put(i+1, sc.nextInt());
		}
		for(int i=0;i<n;i++){
			if(hm.get(hm.get(i+1)) == i+1)
				flag = true;
			else{
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}

	}
}
