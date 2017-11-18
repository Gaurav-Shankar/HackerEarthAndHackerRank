
import java.util.ArrayList;

import java.util.Scanner;


public class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		/* Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //getting all the numbers
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        //assigning 0th element as unique
        int unique=0;
        unique=arr[0];
        for(int i=1;i<arr.length;i++)
        {
           unique^=arr[i];
        }
        System.out.println(unique);
		 */
		Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //getting all the numbers
        for(int i=0;i<n;i++)
      
            arr[i]=sc.nextInt();
        ArrayList<Integer> ll = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
        	if(!ll.add(arr[i])){
        		ll.remove(i);
        	}
        	else{
        		ll.add(arr[i]);
        	}
        }
        System.out.println(arr[0]);
	}
}
