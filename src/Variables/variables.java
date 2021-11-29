package Variables;

public class variables {
	
	static int m = 100; // static variable
	int data = 90; // instance variable
	public void method() {
		System.out.println(data);
	}
	public static void main(String[] args) {
		variables b = new variables();
		b.method();
		int a = 50; // local variable
		System.out.println(a);
		System.out.println(m);
	}

}
