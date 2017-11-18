import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class TestClass {
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	int T = Integer.parseInt(br.readLine());
	Stack<Integer> st = new Stack<Integer>();
	String q;
	for(int i=0;i<T;i++){
		q = br.readLine();
		int que = Integer.parseInt(q.split(" ")[0]);
		if(que == 1 && st.isEmpty()){
			System.out.println("No Food");
		}
		else if(que == 1 && st.isEmpty()!=true){
			System.out.println(st.pop());
		//	st.remove(st.pop());
		}
		else if(que == 2){
			int que2 = Integer.parseInt(q.split(" ")[1]);
			st.push(que2);
			
		}
		
		
	}
}
}
