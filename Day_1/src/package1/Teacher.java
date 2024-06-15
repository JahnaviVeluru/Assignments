/*Create a class named student
Put two variables
Rollno and age
Put 2 methods
Display1()---- >welcome to all of you
Display2()---- >Automation is very easy
Create main method
Create the object of the class call both the variables, give value to those variables and print the values call both the methods as well.

*/
//By using set get methods if we are using Private keyword in variable.
//if we click on class name then automatically we can see the get and set
package package1;

 class Demo {

	private int Rollno;
	private int age;
	
	public void setRollno(int roll) {
		this.Rollno=roll;
	}
	public int getRoll() {
		return this.Rollno;
	}
	public void Display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void Display2()
	
	{
		System.out.println("Automation is very easy");
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class Teacher{
	public static void main(String[]args)// main method
	{
		Demo var =new Demo();
//		var.Rollno=06;
//		var.age=22;
//		System.out.println("Rollno: "+ var.Rollno );
//		System.out.println("age: "+ var.age);
		var.setRollno(27);
		System.out.println(var.getRoll());
		var.Display1();
		var.Display2();
		
		
	}
}
