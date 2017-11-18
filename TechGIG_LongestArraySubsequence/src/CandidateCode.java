import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class CandidateCode { 
    public static void main(String[] args) throws Exception {
    	FileReader fr = new FileReader("F:/Saurabh.txt");
    	BufferedReader br = new BufferedReader(fr);
    	
    System.out.println(fr.read());
	}
}