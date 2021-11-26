package Inheritance;

class TestAnimal {
	void eat() {
		System.out.println("eating....");
	}
}

class TestDog extends TestAnimal {
	void dog() {
		System.out.println("go.......");
	}
}

class Cat extends TestAnimal {
	void cat() {
		System.out.println("meo......");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDog d = new TestDog();
		d.dog();
		d.eat();
	}

}
