package Package;

public class Child extends Parent {

	public Child() {
		super(11,12);
		
		System.out.println("child default constructor");
	}
	public Child(int b1) {
		this(12,11);
		System.out.println("child one parameterized constructor");
	}
	public Child(int b1, int b2) {
		this(11,12,13);
		System.out.println("child two parameterized constructor");
	}
	public Child(int b1, int b2, int b3) {
		this();
		System.out.println("child three parameterized constructor");
	}
	public static void main(String[] args) {
		Child obj =new Child(1);
		
	}

}
