
public class Exp07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.add(1,2,3);
	}

}
class Calculator{
	void add(int v1,int v2) {
		System.out.println(v1+v2);
	}
	void add(int v1,int v2,int v3,int v4,int v5) {
		System.out.println(v1+v2);
	}
	void add(int v1,int v2,int v3,int v4) {
		System.out.println(v1+v2);
	}
	void add(int v1,int v2,int v3) {
		System.out.println(v1+v2);
	}
}