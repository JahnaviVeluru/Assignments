/*Assignment1-- >
 Out put should be in the below sequence(just create only one object and use this keyword)
 three parameterized constructor
 default
 four
 one
 two
 */

package package1;

public class const_Assig {
	public const_Assig()
	
	
	{		
		this(1,2,3);
		
		System.out.println("default constructor");
	}
	public const_Assig(int a)
	{
		this(12,13,14,15);
		
		System.out.println("one parameterized constructor");
	}
	public const_Assig(int a, int b)
	{
		this(12);
		System.out.println("two parameterized constructor");
		
	}
	public const_Assig(int a, int b, int c)
	{
		
		
		System.out.println("three parameterized constructor");
		
		
	}
	public const_Assig(int a, int b, int c, int d)
	{
		this();
		
		System.out.println("four parameterized constructor");
	}
	public static void main(String[] args) {
		const_Assig junnu = new const_Assig(11,13);
		
	}


}
