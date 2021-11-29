package Operator;

public class Operators {

	public static void main(String[] args) {
		// toan tu so hoc
		int p = 5, q= 12, r = 20, s;
		boolean c;
		s = p + q;
		System.out.println("ket qua p + q: " + s);
		s = p % q;
		System.out.println("ket qua p % q: " + s);
		s *= r;
		System.out.println("ket qua s * r: " + s);
		p++ ;
		System.out.println("ket qua p sau tang: "+ p);
		System.out.println("p: " +p);
		p--;
		System.out.println("ket qua sau khi giam: " +p);
		
		// toan tu bit
		System.out.println("Toan tu ~: " + ~p);
		System.out.println("Toan tu and: " + (p & q));
		System.out.println("Toan tu or: " +(p | q));
		System.out.println("Toan tu xor: " + (p ^ q));
		System.out.println("Dich phai a: " + ( p<<2));
		System.out.println("Dich trai b: " + (q>>2));
		// toan tu quan he
		c = p == q;
		System.out.println("ket qua phep (==): " + c);
		c = p != q;
		System.out.println("ket qua phep (!=): " + c);
		c = p < q;
		System.out.println("ket qua phep (<): " + c);
		c = p >= q;
		System.out.println("ket qua phep (>=): " + c);
		
		// toan tu logic
		boolean a = true, b = false;
		c = a && b ;
		System.out.println("ket qua phep (&&): "+ c);
		c = a || b;
		System.out.println("ket qua phep (||): " + c);
		c = !(a && b) ;
		System.out.println("ket qua phep (!): " + c);
		
		// toan tu dieu kien
		q = (p == 1)? 20 : 30 ;
		System.out.println("ket qua q: " + q);
		
		// toan tu gan
		int num = 2000;
		p = q = num;
		System.out.println("ket qua gan: p = " + p + " q = " + q);
	}
}