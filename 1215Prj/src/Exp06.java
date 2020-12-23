
public class Exp06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		int x = 10;
		b.test(x);
	}

}

class A {
	void test(int v) {
		System.out.println("A.test");
	}
}

class B extends A {
	@Override
	void test(int v) {
		System.out.println("B.test");
	}
}