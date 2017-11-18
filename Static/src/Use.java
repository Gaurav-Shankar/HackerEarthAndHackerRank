
public class Use {
public static void main(String[] args) {
	One o1 = new One();
	One o2 = new One();
	One o3 = new One();
	o1.display1();
	o1.display();
	o1.x++;
	One.y++;
	System.out.println(o1.x);
	System.out.println(One.y);
	System.out.println("==========================");
	o2.x++;
	One.y++;
	o3.x++;
	One.y++;
	System.out.println(o2.x);
	System.out.println(One.y);
	System.out.println("==========================");
	new One();
	o3.x++;
	One.y++;
	System.out.println(o3.x);
	System.out.println(One.y);
	System.out.println("\"Hey!! i am getting printed in double quotes\"");
}
}