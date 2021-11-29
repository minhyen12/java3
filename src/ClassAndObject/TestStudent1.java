package ClassAndObject;

class Student {
	int id;
	String name;
}
public class TestStudent1 {

	public static void main(String[] args) {
		Student st = new Student();
		st.id = 2;
		st.name = "GMO";
		System.out.println(st.id + " " + st.name );

	}

}
