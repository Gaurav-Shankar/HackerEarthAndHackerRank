import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
	public static void main(String[] args) throws Exception {
		String name,branch;
		int sem,year;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		name = br.readLine();
		System.out.println("Enter branch");
		branch = br.readLine();
		System.out.println("Enter sem");
		sem = Integer.parseInt(br.readLine());
		if(sem == 1 || sem == 3 || sem == 5 || sem == 7 ){
			year = sem/2 +1;
		}
		else{
			year = sem/2;
		}
		System.out.println("============================================");
		System.out.println("Name : " +name);
		System.out.println("Branch : " +branch);
		System.out.println("Semester  : " +sem);
		System.out.println("Year : " +year);

	}
}
