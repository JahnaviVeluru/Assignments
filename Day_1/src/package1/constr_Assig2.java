/*Assignment1-- >
 Out put should be in the below sequence(just create only one object and use this keyword)
four
one
three
two
default
 */
package package1;

public class constr_Assig2 {

	public constr_Assig2() {
		this(1,2);
		System.out.println("default constructor");
		
		
	}
	public constr_Assig2(int a) {
		this(1,2,4,5);
		System.out.println("one constructor");
		
	}
	public constr_Assig2(int a, int b) {
		this(1,2,4);
		System.out.println("two constructor");
		
	}
	public constr_Assig2(int a, int b, int c) {
		this(1);
		System.out.println("three constructor");
		
	}
	public constr_Assig2(int a, int b, int c, int d) {
		System.out.println("four constructor");
		
	}
	public static void main(String[] args) {
		constr_Assig2 Jannu= new constr_Assig2();
		
	}


}
