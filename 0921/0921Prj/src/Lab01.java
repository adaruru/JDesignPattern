
public class Lab01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 3 * 2;
		short b = 1;
		int ans1 = a - b;
		double c = 1.000000005;
		float d = 1.000000005F;
		System.out.println(a );
		System.out.println(ans1);
		
		double ans2 = ans1 + c;
		float ans3 = ans1 + d;
		
		System.out.println(ans1 + 1.5);
		System.out.println("----------");
		System.out.println(c );
		System.out.println(d );
	}

}
