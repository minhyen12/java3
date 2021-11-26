package Abstraction;

interface Printable {
	void print();
}
interface Showable extends Printable {
	void show();
}		
public class TestInterface implements Showable {

	public void print() {
		System.out.println("Hello");
	}
	public void show() {
		System.out.println("Welcome");
	}
	public static void main(String[] args) {
		TestInterface test = new TestInterface();
		test.print();
		test.show();
	}
}
