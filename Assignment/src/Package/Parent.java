package Package;


public class Parent {

	public Parent() {
		this(1,2,4);
		System.out.println("parent default constructor");
	}
	public Parent(int a1) {
		this();
		System.out.println("parent one parameterized constructor");
	}
	public Parent(int a1,int a2) {
		this(11);
		System.out.println("parent two parameterized constructor");
	}
		
	public Parent(int a1,int a2, int a3) {
		System.out.println("parent three parameterized constructor");
	}
	public static void main(String[] args) {
		
		
		
	}
		

		
		
	
}
