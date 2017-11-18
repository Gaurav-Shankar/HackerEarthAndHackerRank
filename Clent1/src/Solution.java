import java.io.*;
import java.net.Socket;
public class Solution {
public static void main(String[] args) throws Exception{
	Socket s = new Socket("localhost", 666);
	InputStream obj = s.getInputStream();
	BufferedReader bra = new BufferedReader(new InputStreamReader(obj));
	String Str;
	while((Str = bra.readLine()) != null){
		System.out.println("From server = "+ Str);
	}
	bra.close();
	s.close();
}
}
