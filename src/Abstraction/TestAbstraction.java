package Abstraction;

abstract class Shape {
	abstract void draw();
}
class Ractangle extends Shape {
	void draw() {
		System.out.println("Ve hinh chu nhat");
	}
}
class Cricle extends Shape {
	void draw() {
		System.out.println("Ve hinh tron");
	}
}
public class TestAbstraction {

	public static void main(String[] args) {
		Shape s = new Cricle();
		s.draw();
	}

}
