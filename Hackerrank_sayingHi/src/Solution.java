import java.util.Scanner;


public class Solution {
public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	int N  = sc.nextInt();
	for(int i=0;i<N;i++){
		boolean res =  false;
		String line = sc.nextLine();
		String arr[] =  line.split(" ");
		
		if(arr[0].equalsIgnoreCase("hi")){
			res = true;
		}
		else{
			continue;
		}
		if(res){
			if(arr[1].startsWith("d")||arr[1].startsWith("D")){
				res =  false;
			}
			else{
				System.out.println(line);
			}
		}
		
	}
}
}
