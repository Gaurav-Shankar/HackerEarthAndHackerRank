import java.util.Scanner;
 class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			int num,count=0;
			int S = sc.nextInt();
			for(int j=0;j<S;j++){
				num = sc.nextInt();
				if(num>0){
					count++;
				}
				else{
					continue;
				}
			}
			System.out.println(count);
		}
	}
}
