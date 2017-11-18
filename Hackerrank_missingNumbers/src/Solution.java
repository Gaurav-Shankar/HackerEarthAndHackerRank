import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();

		long m = sc.nextLong();
		int[] A = new int[(int) m];
		for(long i=0;i<m;i++){
			A[(int) i] = sc.nextInt();
		}
		long n = sc.nextLong();
		int[] B = new int[(int) n];

		for(long i=0;i<n;i++){
			B[(int) i] = sc.nextInt();
		}
		Arrays.sort(A);
		Arrays.sort(B);
		for(long i=0;i<A.length;i++){
			for(long j=0;j<B.length;j++){
				if(A[(int) i] - B[(int) j] == 0){
					A[(int) i] = 0;
					B[(int) j] = 0;
					continue;
				}
			}
		}
		for(long i=0;i<B.length;i++){
			if(B[(int) i] == 0){
				continue;
			}else{

				al.add(B[(int) i]);
			}
		}
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		h.addAll(al);
		al.clear();
		al.addAll(h);
		for(int i=0;i<al.size();i++){
			System.out.print(al.get(i));
			System.out.print(" ");
		}
	}
}
