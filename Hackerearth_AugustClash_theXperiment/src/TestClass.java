
/*
 * Problem :  Generate the 10001th prime number!
 */
import java.util.ArrayList;
import java.util.Scanner;
public class TestClass {
	public static void calcPrime(int inp) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(3);

		int counter = 4;

		while(arr.size() < inp) {
			if(counter % 2 != 0 && counter%3 != 0) {
				int temp = 4;
				while(temp*temp <= counter) {
					if(counter % temp == 0)
						break;
					temp ++;
				}
				if(temp*temp > counter) {
					arr.add(counter);
				}
			}
			counter++;
		}
		for(int i=0;i<arr.size();i++){
			System.out.print(arr.get(i) + " ");
		}
		
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			int N = sc.nextInt();
			calcPrime(N);
		}
	}
}
