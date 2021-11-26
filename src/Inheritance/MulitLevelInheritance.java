package Inheritance;

class Animal {
	void eat() {
		System.out.println("eating....");
	}
}

class Dog extends Animal {
	void brak() {
		System.out.println("braking...");
	}
}

class BabyDog extends Dog {
	void weep() {
		System.out.println("weeping...");
	}
}
public class MulitLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog d = new BabyDog();
		d.eat();
		d.brak();
		d.weep();
	}

}
