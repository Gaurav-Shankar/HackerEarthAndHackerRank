/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution {
	 public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++){
			String ipaddress = br.readLine();
			String ipv4 = "([0-9]{1,}.[0-9]{1,}.[0-9]{1,}.[0-9]{1,})";
			String ipv6 = "^([0-9A-Fa-f]{1,4}:){7}[0-9A-Fa-f]{1,4}$";
			Pattern p1 = Pattern.compile(ipv4);
			"^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9]{1,2})(\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[0-9]{1,2})){3}$";
			Pattern p2 = Pattern.compile(ipv6);
			Matcher m1;
			
			if(m2.find()){
				System.out.println("IPv6");
				
			}
			else if(m1.find()){
				System.out.println("IPv4");
			}
			else{
				System.out.println("Neither");
			}

		}
	}
}*/
/*
  @author Gaurav Shankar
 */
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sun.misc.Regexp;
public class Solution {
	public static void main(String[] args) {
		
            Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
       
        String ip4Regex="([0-9]{1,}.[0-9]{1,}.[0-9]{1,}.[0-9]{1,})";
        Pattern ip4Pattern = Pattern.compile(ip4Regex);
       
        String ip6Regex="^([0-9A-Fa-f]{1,4}:){7}[0-9A-Fa-f]{1,4}$";
        Pattern ip6Pattern = Pattern.compile(ip6Regex);
           
        Matcher matcher;
        for(int i=0;i<=n;i++)
        {
            String line = sc.nextLine();
            if(!line.equals(""))
            {
                matcher = ip4Pattern.matcher(line);
               
                if(matcher.matches())
                    System.out.println("IPv4");
                else
                {
                    matcher = ip6Pattern.matcher(line);
       
                    if(matcher.matches())
                        System.out.println("IPv6");
                    else 
                        System.out.println("Neither");
                }
            }
        }
       
        sc.close();
       }

}
