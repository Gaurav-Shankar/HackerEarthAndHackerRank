import java.awt.geom.Line2D;
import java.util.Scanner;


public class TestClass {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	int x1 = 0,y1=0,x2=0,y2=0,Xc=0,Yc=0;
	for(int i=0;i<T;i++){
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		Xc = sc.nextInt();
		Yc = sc.nextInt();
		Line2D line1 = new Line2D.Float(x1, y1, x2, y2);
		Line2D line2 = new Line2D.Float(0, 0, Xc, Yc);
		if(line1.intersectsLine(line2)){
			System.out.println("NO");
		}
		else{
			System.out.println("YES");
		}
	}
	
}
}
