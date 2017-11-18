import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class TestClass {
public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String q = br.readLine();
	int accesiblness = 0;
	int N = Integer.parseInt(q.split(" ")[0]);
	int M = Integer.parseInt(q.split(" ")[1]);
	LinkedList<Integer> ar = new LinkedList<Integer>();
	String nums = br.readLine();
	for(int i=0;i<N;i++){
		ar.add(Integer.parseInt(nums.split(" ")[i]));
	}
	for(int i=0;i<M;i++){
		String q1 = br.readLine();
		int number = Integer.parseInt((q1.split(" ")[0]));
		//System.out.println("before  "+ ar);
		accesiblness = accesiblness + Math.min(ar.indexOf(number), ar.size()-1-ar.indexOf(number));
		if(q1.split(" ")[1].toString().equals("r")){
			int g = ar.indexOf(number);
			ar.remove(g);
			ar.addLast(number);
		}
		else if(q1.split(" ")[1].toString().equals("l")){
			int g = ar.indexOf(number);
			ar.remove(g);
			ar.addFirst(number);
		}
		//System.out.println(ar);
	}
	System.out.println(accesiblness);
	
	
	
}
}
