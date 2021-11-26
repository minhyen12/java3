package ClassAndObject;

class Employee {
	int id ;
	String name;
	float salry;
	void insert (int i, String n, float s) {
		id = i;
		name = n;
		salry = s;
	}
	void display() {
		System.out.println(id +" "+ name +" "+ salry);
	}
}
public class TestEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.insert(1, "GMO", 10000);
		emp2.insert(2, "Runsystem", 2000);
		emp1.display();
		emp2.display();

	}

}
