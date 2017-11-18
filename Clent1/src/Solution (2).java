import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

 public class Solution {
public static void main(String[] args) throws Exception {
	ServerSocket ss = new ServerSocket(666);
	Socket s = ss.accept();
	System.out.println("Connection Established");
	OutputStream obj = s.getOutputStream();
	PrintStream ps = new PrintStream(obj);
	String str = "Hello Client!";
	ps.println(str);
	ps.println("Bye!");
	ps.close();
	ss.close();
	s.close();
}
}
