public class Fraction {
	// instance variables/attributes/fields
	private int numerator;
	private int denominator;
	
	// constructor
	public Fraction() { // default
		numerator = (int) (Math.random() * 10);
		denominator = (int) (Math.random() * 9 + 1);
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
	
	// accessor methods
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
	
	public void reduce() {
		int GCF = GCF(numerator, denominator);
		numerator = numerator / GCF;
		denominator = denominator / GCF; 
	}
	
	// static methods
	public static Fraction add(Fraction a, Fraction b) {
		Fraction f = new Fraction();
		f.numerator = a.numerator * b.denominator + b.numerator * a.denominator;
		f.denominator = a.denominator * b.denominator;
		return f;
	}
	
	public static Fraction subtract(Fraction a, Fraction b) {
		Fraction f = new Fraction();
		f.numerator = a.numerator * b.denominator - b.numerator * a.denominator;
		f.denominator = a.denominator * b.denominator;
		return f;
	}
	
	public static Fraction mult(Fraction a, Fraction b) {
		Fraction f = new Fraction();
		f.numerator = a.numerator * b.numerator;
		f.denominator = a.denominator * b.denominator;
		return f;
	}
	
	public static Fraction divide(Fraction a, Fraction b) {
		Fraction f = new Fraction();
		f.numerator = a.numerator * b.denominator;
		f.denominator = a.denominator * b.numerator;
		return f;
	}
	
	// helper methods
	private int GCF(int n, int d) {
		while (n != d) {
			if (n > d) {
				n = n - d;
			} else {
				d = d - n;
			}
		}
		return n;
	}
}
