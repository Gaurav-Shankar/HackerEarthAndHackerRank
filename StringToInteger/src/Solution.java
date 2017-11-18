import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        int T = sc.nextInt();
        long N;
        for(int i =0;i<T;i++){
            String str;
           
            N = sc.nextLong();
            str = Integer.toBinaryString((int) N);
            System.out.println(str  +"  "+ str.length());
                if(str.length() <= 8){
                System.out.println(N+" can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
              }
            else if(str.length() > 8 && str.length() <= 16){
                    
                System.out.println(N+" can be fitted in:");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");               
            }
            else if(str.length() >16 && str.length() <= 32){
                
                System.out.println(N+" can be fitted in:");
                System.out.println("* int");
                System.out.println("* long");
            }
            else if(str.length()>32 && str.length() <=64){
                
                System.out.println(N+" can be fitted in:");
                System.out.println("* long");
            }
            else{
                
                System.out.println(N+" can't be fitted anywhere.");
            }
        
    
}}}