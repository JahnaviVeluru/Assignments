
package Package;

public class child1 extends Parent1{
	public child1() {
		this(1);
		System.out.println("child default");
	}
	public child1(int a1) {
		this(1,2);
		System.out.println("child one parameterized constructor");
	}
	public child1(int a1, int a2) {
		super(11);
		System.out.println("child two parameterized constructor");
	}
	public child1(int a1, int a2, int a3) {
		this();
		System.out.println("child three parameterized constructor");
	}
	public static void main(String[] args) {
		child1 obj=new child1(11,12,1);
	}

}
