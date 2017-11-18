import java.util.Scanner;


public class TestClass {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T  =sc.nextInt();
	int monkiness=0,maxmonkiness=0;
	int[] A ;
	int[] B; 
	for(int i=0;i<T;i++){
		monkiness=0;
		maxmonkiness=0;
		int N = sc.nextInt();
		A = new int[N];
		B = new int[N];
		for(int j=0;j<N;j++){
			A[j] = sc.nextInt();
		}
		for(int j=0;j<N;j++){
			B[j] = sc.nextInt();
		}
		
		for(int j=0;j<N;j++){
			for(int k=j+1;k<N;k++){
				if(k>=j && B[k]>=A[j]){
					//System.out.println(B[k] +"  "+ A[j]);
					monkiness = k-j;
				}
				else{
					monkiness = 0;
				}
				if(monkiness > maxmonkiness){
					maxmonkiness = monkiness;
				}
			}
		}
		System.out.println(maxmonkiness);
}
}
}
