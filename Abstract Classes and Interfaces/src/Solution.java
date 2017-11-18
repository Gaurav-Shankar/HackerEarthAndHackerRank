import java.util.Dictionary;

public class Solution {
	public final static int i=0;
	public static void main(String[] args) throws Exception  {
		Retailer1 r1 = new Retailer1();
		Retailer2 r2 = new Retailer2();
		i = i+1;
		r1.sellErasers();r1.sellPencils();r1.sellXbooks();
		r2.sellbooks();r2.sellerasers();r2.sellpencils();
		System.out.println();;
		
	}
	

}

