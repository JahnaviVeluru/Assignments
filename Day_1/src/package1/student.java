/*Create a class named student
Put two variables
Rollno and age
Put 2 methods
Display1()---- >welcome to all of you
Display2()---- >Automation is very easy
Create main method
Create the object of the class call both the variables, give value to those variables and print the values call both the methods as well.
*/
package package1;

public class student {
	int rollno;
	int age;
	public void Display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void Display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[]args)
	{
		student var =new student();
		var.rollno= 06;
		var.age = 22;
		System.out.println("rollno:"+var.rollno);
		System.out.println("age: "+var.age);
		var.Display1();
		var.Display2();
		
		
				
		
	}

}
