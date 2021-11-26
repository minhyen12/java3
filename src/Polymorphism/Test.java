package Polymorphism;

class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

class TPBank extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class VCBBank extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b ;
		b = new TPBank();
		System.out.println("Lai suat cua TP: " + b.getRateOfInterest());
		b = new VCBBank();
		System.out.println("Lai suat cua VCB: "+ b.getRateOfInterest());
	}

}
