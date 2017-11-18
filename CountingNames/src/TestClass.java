import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class TestClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] names; 
		ArrayList<String> h = new ArrayList<String>(T);
		for(int i=0;i<T;i++){
			h.add(sc.next());
		}
		Collections.sort(h);

		while(h.size() != 0){
			System.out.println(h.get(0) +" "+ Collections.frequency(h, h.get(0)));	
			h.removeAll(Collections.singleton(h.get(0)));
		}






	}
}
