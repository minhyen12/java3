package Polymorphism;

class Vehicle {
	void run() {
		System.out.println("Phuong tien chung");
	}
}

public class Honda extends Vehicle {
	void run() {
		System.out.println("Phuong tien cua honda");
	}
	public static void main(String[] args) {
		Vehicle b = new Vehicle();
		b.run();
	}

}
