import java.util.Scanner;

public class FractionQuiz {
	public static boolean equals(Fraction f, Fraction f3) {
		f3.reduce();
		if (f.getNum() == f3.getNum() && f.getDenom() == f3.getDenom()) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = "1/1";
		int numCorrect = 0;
		int numRuns = 0;
		
		Fraction f3;
		System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");
		System.out.println();
		
		while (!input.equals("quit")) {
			Fraction f1 = new Fraction();
			f1.reduce();
			Fraction f2 = new Fraction();
			f2.reduce();
		
			int opChoose = (int) (Math.random() * 4);
			
			if (opChoose == 0) {
				System.out.printf("%s + %s = ", f1, f2);
				f3 = Fraction.add(f1, f2);
			} else if (opChoose == 1) {
				System.out.printf("%s - %s = ", f1, f2);
				f3 = Fraction.subtract(f1, f2);
			} else if (opChoose == 2) {
				System.out.printf("%s * %s = ", f1, f2);
				f3 = Fraction.mult(f1, f2);
			} else {
				System.out.printf("%s / %s = ", f1, f2);
				f3 = Fraction.divide(f1, f2);
			}
			
			input = in.nextLine();
			if (!input.equals("quit")) {
				Fraction f = new Fraction(input);
				if (equals(f, f3)) {
					System.out.println("Correct!");
					numCorrect += 1;
					numRuns += 1;
				} else {
					numRuns += 1;
					System.out.printf("Wrong, the answer was %s", f3);
				}
			}
			System.out.println();
		}
		
		double ratio = ((double) numCorrect/numRuns) * 100;
		System.out.printf("You answered %d/%d correctly, for a score of %.0f percent!", numCorrect, numRuns, ratio);
	}
}

		
