import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TestClass {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int count;
		while(T-- >0){
			count = 0;
			String[] str = br.readLine().split(" ");
			String d[] = str[0].split("(?!^)");
			String c[] = str[1].split("(?!^)");
			int sum=0;
			for(int i=d.length-1;i>=0;i--){
				int r = Integer.parseInt(d[i]);
				int g = Integer.parseInt(c[i]);
				sum = sum + r + g;
				if( sum > 9){
					count++;
					sum = 1;
				}
				else{
					sum=0;
				}



			}
			if(count == 0)
				System.out.println("No carry operation");
			else if(count == 1)
				System.out.println(count+" carry operation");
			else
				System.out.println(count+" carry operations");
		}
		br.close();
	}
}
