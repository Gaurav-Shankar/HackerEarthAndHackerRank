import java.util.Scanner;


public class TestClass {
	static int ReturnAngle(int H, int M){
		if(H==12) H= 0;
		if(M==60) M=0;
		
		int Ha = (int) (0.5 * (H * 60 + M));
		int Ma = 6*M;
		int Angle = Math.abs(Ha-Ma);
		return Math.min(Angle, 360-Angle);
			
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T =  sc.nextInt();
	int H,M;
	while(T-- > 0){
		H = sc.nextInt();
		M = sc.nextInt();
		System.out.println(ReturnAngle(H, M));
	}
}
}
