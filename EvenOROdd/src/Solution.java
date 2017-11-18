/*
 * 
 */
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		if((number & 1) == 0){
			System.out.println("Even number");
		}
		else{
			System.out.println("Odd number");
		}
	}
}
