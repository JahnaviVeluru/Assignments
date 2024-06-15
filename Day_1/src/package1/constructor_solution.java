package package1;
//solution:1 I have create 5 variables, assign the values to those variables and needs to print the value of those variables

public class constructor_solution {
	int a, b, c, d, e;
	public static void main(String[] args) {
		constructor_solution obj= new constructor_solution();
		obj.a=12;//1st call
		obj.b=11;//2nd
		obj.c=10;//3rd
		obj.d=54;//4th
		obj.e=22;//5th
		System.out.println(obj.a);//6t
		System.out.println(obj.b);//7th
		System.out.println(obj.c);//8th
		System.out.println(obj.d);//9th
		System.out.println(obj.e);//10th
		// for single object calling 10 calls( five for assigning the value+ five for printing the values)
		//for 20 objects calling 20*10 here we are calling 200 calls
		
}
	
}

