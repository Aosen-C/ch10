public class Fraction {
	// instance variables/attributes/fields
	private int numerator;
	private int denominator;
	
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
	
	public Fraction(String str) {
		int i = str.indexOf("/");
		if (i == -1) {
			System.out.println("Not a valid input");
		}
		if (str.indexOf("/", i + 1) != -1) {
			System.out.println("Error: Not a valid input");
		}
		numerator = Integer.parseInt(str.substring(0, i));
		if (str.substring(i + 1).equals("0")) {
			System.out.println("Error: Denominator cannot be 0");
			denominator = 1;
		} else {
			denominator = Integer.parseInt(str.substring(i + 1));
		}
	}
	
	public Fraction(Fraction f) {
		numerator = f.numerator;
		denominator = f.numerator;
	}
	
	// behaviour methods
	public int getNum() {
		return numerator;
	}
	
	public int getDenom() {
		return denominator;
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	public double toDouble() {
		return (double) numerator / (double) denominator;
	}
	
	// mutator methods
	public void setNum(int n) {
		numerator = n;
	}

	public void setDenom(int d) {
		if (d != 0) {
			denominator = d;
		} else {
			denominator = 1;
			System.out.println("Denominator cannot be 0");
		}
	} 
}
