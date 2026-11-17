public class Fraction {
	// instance variables/attributes/fields
	int numerator;
	int denominator;
	
	// constructor
	public Fraction() { // default
		numerator = 1;
		denominator = 1;
	}
	
	public Fraction(int n, int d) { // parameterized constructor
		numerator = n;
		if (d != 0) {
			denominator = d;
		} else {
			denominator = 1;
			System.out.println("Denominator cannot be 0");
		}
	}
	
	// behaviour methods
}
