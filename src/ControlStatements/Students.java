package ControlStatements;

public class Students {

	public static void main(String[] args) {
		String city = "Ha Noi";
		if(city == "Da Nang") {
			System.out.println("city is da nang");
		} else if (city == "HCM") {
			System.out.println("City is HCM");
		} else {
			System.out.println(city);
		}
		
		int num = 2 ;
		switch(num) {
		case 0 : System.out.println("number is 0");
			break;
		case 1: System.out.println("number is 1");
			break;
		default: System.out.println(num);
		}
		
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			sum += i;
		}
		System.out.println("Tong la: " + sum );
		
		String[] names = {"Java", "C", "PHP"};
		System.out.println("Danh sach ten: ");
		for (String name:names) {
			System.out.println(name);
		}
		
		int j = 0;
		System.out.println("Vong lap while");
		while (j < 10) {
			j += 2;
			System.out.println(j);
		}
		int a = 0;
		System.out.println("Vong lap do while");
		do {
			System.out.println(a);
			a += 3;
		} while(a < 10);
		System.out.println("Su dung break");
		for (int b =0; b < 10; b++) {
			System.out.println(b);
			if( b ==5 ) break;
		}
		
		System.out.println("su dung continue");
		for (int e = 1; e <= 5; e++) {
			if (e == 3) continue;
				System.out.println(e);
		}  
	}

}
