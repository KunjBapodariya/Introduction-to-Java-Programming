/*
* @author Kunj Bapodariya 20CS006
* @email 20cs006@charusat.edu.in
(Generate random characters) Use the methods in RandomCharacter in Listing
5.10 to print 100 uppercase letters and then 100 single digits, printing ten per line.
*/
public class RandomCharacter {
	/** Generate a random character between ch1 and ch2 */
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	/** Generate a random lowercase letter */
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}

	/** Generate a random uppercase letter */
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	/** Generate a random digit character */
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}

}