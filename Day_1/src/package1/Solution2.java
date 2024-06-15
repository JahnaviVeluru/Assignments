package package1;

public class Solution2 {
	int a,b,c,d,e;
	public void method(int x1, int x2, int x3, int x4, int x5)
	{
		a= x1;
		b=x2;
		c=x3;
		d=x4;
		e=x5;
	}
	public static void main(String[] args) {
		Solution2 obj=new Solution2();
		obj.method(11,22, 111, 33, 55);//1st
		System.out.println(obj.a);//2nd
		System.out.println(obj.b);//3rd
		System.out.println(obj.c);//4th
		System.out.println(obj.d);//5t
		System.out.println(obj.e);//6th
		//with the help of method--- >for single object-- >6 calls(one for assigning the value+ five for printing the values)
		//for 20 objects--- >20*6= 120 calls
		//60 calls reduced by using method.
		
		
		
	}

}

