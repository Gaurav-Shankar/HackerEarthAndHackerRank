import java.util.Scanner;


public class Solution {
	static String hexToBin(String hex){
	    String bin = "";
	    String binFragment = "";
	    int iHex;
	    hex = hex.trim();
	    hex = hex.replaceFirst("0x", "");

	    for(int i = 0; i < hex.length(); i++){
	        iHex = Integer.parseInt(""+hex.charAt(i),16);
	        binFragment = Integer.toBinaryString(iHex);

	        while(binFragment.length() < 4){
	            binFragment = "0" + binFragment;
	        }
	        bin += binFragment;
	    }
	    return bin;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	//int num ;
	int count1=0,count0 =0;
	for(int i=0;i<T;i++){
		count1=0;
		count0=0;
		String num = sc.next();
		String bin = hexToBin(num);
		//System.out.println(bin);
		for(int j=0;j<bin.length();j++){
			if(bin.charAt(j) == '1')
				count1++;
			else
				count0++;
		}
		System.out.println(count1 +" "+ count0);
	}
}
}
