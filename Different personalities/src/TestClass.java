import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class TestClass {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	Set<Long> ss = new HashSet<Long>();
	long N;
	for(int i=0;i<T;i++){
		N = sc.nextLong();
		for(int j=0;j<N;j++){
			ss.add(sc.nextLong());
		}
		System.out.println(ss.size());
		ss.clear();
		
	
	}
	
}
}
