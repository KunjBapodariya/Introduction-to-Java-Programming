/*
* @author Kunj Bapodariya 20CS006
* @email 20cs006@charusat.edu.in
(Generate random characters) Use the methods in RandomCharacter in Listing
5.10 to print 100 uppercase letters and then 100 single digits, printing ten per line.
*/
class Exercise_05_38 {
    public static void main(String[] args) {
		final int uppercase_letter = 100; // Number of uppercase letters
		final int single_digit = 100;	// Number of single digits
		final int num_perline = 10; // Print 10 characters per line

		// Print 100 uppercase letters
		for (int i = 1; i <= uppercase_letter; i++) {
			System.out.print(RandomCharacter.getRandomUpperCaseLetter());
			System.out.print(i % num_perline == 0 ? "\n" : " ");
		}

		// Print 100 single digits
		for (int i = 1; i <= single_digit; i++) {
			System.out.print(RandomCharacter.getRandomDigitCharacter());
			System.out.print(i % num_perline == 0 ? "\n" : " ");
		}
	}
}
