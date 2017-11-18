import java.util.Arrays;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int packets = sc.nextInt();
		int kids = sc.nextInt();
		int[] noOfChoc = new int[packets];
		//Hint kid[] = new Hint[kids];
		for(int i=0;i<packets;i++){
			noOfChoc[i] = sc.nextInt();
		}
		Arrays.sort(noOfChoc);
		for(int i=0;i<noOfChoc.length;i++){
			System.out.println(noOfChoc[i]);
		}
		int result = noOfChoc[kids-1] - noOfChoc[0];
		System.out.println(result);
	}
}
