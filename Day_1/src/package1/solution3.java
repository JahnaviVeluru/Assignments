package package1;

public class solution3 {
	
	int a,b,c,d,e;
	public solution3(int x1, int x2, int x3, int x4, int x5)
	{
		a=x1;
		b=x2;
		c=x3;
		d=x4;
		e=x5;
				
	}
	public static void main(String[] args) {
		solution3 obj=new solution3(11,22,33,44,55);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);
	}

}
//we can create a constructor, that constructor will assign the value and after that we can print the value
//with the help of constructor for single object 5 calls( constructor will assign + five for printing the values)
//for 20 objects 20*5=100 calls 