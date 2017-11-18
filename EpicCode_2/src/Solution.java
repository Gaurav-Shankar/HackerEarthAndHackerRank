import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Solution {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long T = sc.nextLong();
	String str;
	long sum = 0;
	Long count;
	for(int i=0;i<T;i++){
		str = sc.next();
		sum=0;
		count = null;
		Map<Character, Long> map = new HashMap<>();
		for (char c : str.toCharArray())
		{
			count = map.get(c);
			if (count == null)
				count = (long) 0;
			map.put(c, count + 1);
		}
		for (Long n : map.values())
			sum += ((n - 1) * n) / 2;
		System.out.println(sum+str.length());
	}
	sc.close();
}
}


