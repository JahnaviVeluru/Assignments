package package1;

public class constructor_Day3 {
	
	public constructor_Day3()
	{
		//this(11);
		System.out.println("default constructor");	
	}
	public constructor_Day3(int a) {
		this(11,12);
		
		System.out.println("one parameterized constructor");
		
	}
	public constructor_Day3(int a, int b)
	{
		this();
		System.out.println("two parameterized constructor");
	}
	public static void main(String[] args) {
		//code execute line by line code from the main method
		//constructor_Day3 jahnavi= new constructor_Day3(11,22);
		constructor_Day3 junnu= new constructor_Day3(11);
		//constructor_Day3 jannu= new constructor_Day3();
		
	}
	


	

	

}
