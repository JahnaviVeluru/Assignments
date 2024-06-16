package Package;

public class Parent1 {
	public Parent1() {
		this(11,33);
		
		System.out.println("Parent default");
	}
	public Parent1(int b1) {
		this(1,2,3);
		System.out.println("Parent one parameterized");
	}
	public Parent1(int b1, int b2) {
		
		System.out.println("Parent two parameterized");
	}
	public Parent1(int b1, int b2, int b3) {
		this();
		System.out.println("Parent three parametrized");
	}
	
	

	
	

}
