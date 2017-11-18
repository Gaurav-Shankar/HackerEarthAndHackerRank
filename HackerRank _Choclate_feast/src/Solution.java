
/*
 * import java.io*;
 */

import java.util.*;
public class Solution {
	private static int numberOfChocolatesForWrappers(int chocolates, int M) {
        int result = 0;
        while (chocolates / M > 0) {
               result += chocolates / M; //chocolate we can get
               //chocolates we can get + chocolate/ wrappers unused
               chocolates = (chocolates / M) + (chocolates % M);
        }
        return result;
 }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int bill, int price, int rapperReq){
    	int choc = bill/price;
    	if(choc < rapperReq){
    		return choc;
    	}
    	else if(choc == rapperReq){
    		return choc +1;
    	}
    	else {
    		
    	int total = choc + numberOfChocolatesForWrappers(choc, rapperReq);
    	return total;
    	}
    	
         //Write code to solve each of the test over here
    }
    
    
}
