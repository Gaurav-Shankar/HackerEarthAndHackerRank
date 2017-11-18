import java.util.Scanner;


public class Soluiton {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	int A,count;
	for(int i=0;i<T;i++){
		count=0;
		A = sc.nextInt();
		int D = (int) Math.sqrt(A);
		int z;
		for(int j=1;j<=D;j++){
			if(A%j == 0){
				if(j%2 == 0){
				z = A/j;
				if((z%2 == 1 && (j%2==0)) || ((z%2==0) && (j%2==1)) || (z==j)){
					count++;
				}
				}
				else if(j%2==1){
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
}
}
