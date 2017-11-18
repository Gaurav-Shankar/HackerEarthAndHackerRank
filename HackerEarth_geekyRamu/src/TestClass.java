import java.awt.List;
import java.util.ArrayList;
import java.util.Set;


class TestClass {
	public static ArrayList<Integer> primeFactors(long number) { 
		ArrayList<Integer> primefactors = new ArrayList<Integer>(); 
		long copyOfInput = number; 
		for (int i = 2; i <= copyOfInput; i++) { 
			if (copyOfInput % i == 0) { 
				primefactors.add(i);  
				copyOfInput =  copyOfInput/i; 
				i--;
			}
		} 
		int n = primefactors.size();
		System.out.println("n "+n);
		for(int j=0;j<n;j++){
			System.out.println(j);
			if(primefactors.contains(primefactors.get(j))){
				primefactors.remove(primefactors.get(j));
				j--;
			}
		}
		return primefactors; 
	}
public static void main(String[] args) {
System.out.println(primeFactors(100));
}
}
