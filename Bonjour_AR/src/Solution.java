import java.util.Scanner;

/*
 * There is a party thrown by a couple.
Guest couples are invited in it. There are handshakes between them. The handshakes between the guests take place within the same gender only, i.e. no man and woman will shake each other's hand. But the host couple will shake hands of all those present in the party.

Now, suppose in the total number of couples that were invited, some couples were disabled and did not have right hand. That is either both the husband and wife are disabled or none is disabled.

So, what's the total number of Right-Right handshakes. Similarly calculate number of R-L and L-L handshakes that happened within the party?


By the way bonjour means hello in French, ciao.
 */
public class Solution {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter total couples : ");
	long couples  = sc.nextLong();
	System.out.println("Enter disabled couples : ");
	long disables = sc.nextLong();	long okCouples = couples - disables;
	//For all R-R hand shakes
	long RR =0;
	for(long i=okCouples-1;i!=0;i--){
		RR = RR + i;
	}
	//Hand Shaking with the hosts
	RR = RR + (okCouples*2);
	System.out.println("Total R-L HandShakes = " + 2*RR);
	
	//For all R-L hand Shakes
	long RL = (disables*okCouples);
	//Hand shaking with the hosts
	RL = RL + (2*disables);
	System.out.println("Total R-L HandShakes = " + 2*RL);
	
	//For all L-L hand Shakes
	long LL =0;
	for(long i=disables-1;i!=0;i--){
		LL = LL + i;
	}
	System.out.println("Total L-L HandShakes = " + 2*LL);
	
	
}
}
