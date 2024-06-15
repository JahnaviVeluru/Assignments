/*assignemt: using this keyword output should be in below sequence
 * three parameterized
 * default
 * one parameterized
 * two parameterized
 */

package Package;

public class Constructor_Day3 {
	public Constructor_Day3() {
		this(21,32,90);
		System.out.println("default constructor");
	}
	public Constructor_Day3(int a) {
		this();


		System.out.println("one parameterized constructor");
	}

	public Constructor_Day3(int a, int b) {
		this(11);
		System.out.println("two parameterized constructor");
	}

	public Constructor_Day3(int a, int b, int c) {

		System.out.println("three parameterized constructor");
	}
	public static void main(String[] args) {
		Constructor_Day3 obj=new Constructor_Day3(1,2);
	}

}





