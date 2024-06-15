package Package;

public class Student {
	int age;
	int rollno;
	public void Display1() {
		System.out.println("Welcome to all of you");
	}
	public void Display2() {
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		Student name =new Student();
		name.Display1();
		name.Display2();
		name.age=23;
		name.rollno=6;
		System.out.println("Age is :"+name.age);
		System.out.println("RollNo is :"+name.rollno);
	}

}
