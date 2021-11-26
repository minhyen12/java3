package Inheritance;

class Employee {
	float salary = 2000;
}

class Programmer extends Employee {
	float bouns = 1900;
}

public class InheritanceSample1 {

	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("Programmer salary is: " + p.salary);
		System.out.println("Bonus of Programmer is: " + p.bouns);
	}

}
