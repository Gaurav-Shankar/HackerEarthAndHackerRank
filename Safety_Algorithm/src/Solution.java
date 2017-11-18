
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		//Asking for number of resources
		System.out.println("Enter no. of Resources : ");
		int Resources = sc.nextInt();
		//Asking for number of processes
		System.out.println("Enter no. of Processes : ");
		int processes = sc.nextInt();
		//array declaring matrix for allocation
		System.out.println("Enter allocation : ");
		int[][] allocation = new int[processes][Resources];
		for(int i=0;i<processes;i++){
			for(int j=0;j<Resources;j++){
				allocation[i][j] = sc.nextInt(); 
			}
		}
		//array declaring available matrix
		System.out.println("Enter available : ");
		int[][] available  = new int[1][Resources];
		for(int i=0;i<Resources;i++){
			available[0][i] = sc.nextInt(); 
		}
		//array declaring matrix for max
		System.out.println("Enter max : ");
		int[][] max = new int[processes][Resources];
		for(int i=0;i<processes;i++){
			for(int j=0;j<Resources;j++){
				max[i][j] = sc.nextInt();
			}
		}
		//array declaring matrix for need
		int[][] need = new int[processes][Resources];
		//Calculating the contents of the need matrix
		for(int i=0;i<processes;i++){
			for(int j=0;j<Resources;j++){
				need[i][j] = max[i][j] - allocation[i][j];
			}
		} 
		System.out.println("Displaying need matrix");
		for(int i=0;i<processes;i++){
			for(int j=0;j<Resources;j++){
				System.out.print(need[i][j] + " ");
			}
			System.out.println("");
		} 





	}

}
