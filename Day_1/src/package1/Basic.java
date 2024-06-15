package package1;

public class Basic {
	//boundary of the class
	
	int jahnavi; //variable name jahnavi
	public void display()// () indicates this is method
	{
		// boundary of the method
		//method name display
		
		
		System.out.println("Welcome all");// to display the message in the console
		
	}
	public static void main(String[]args)// main method
	
	{
		Basic java=new Basic();//classname reference variable = new keyword classname();
		java.jahnavi=111;//reference variable.variable name= value//calling variable
		System.out.println("value of jahnavi "+java.jahnavi);
		java.display();//calling method
	}
	
	
}
