package package1;

public class method_Day2 {
	public int sum(int a, int b)
	{
		int c;
		c= a+b;
		System.out.println("sum result is "+c);
		return c;
	}
	public int sub(int x, int y)
	{
		int z;
		z= x-y;
		System.out.println("sub result is "+z);
		return z;
	}
	public void multi(int x1, int x2)
	{
		int result;
		result=x1*x2;
		System.out.println("final result is "+result);
		
	}
	public static void main(String[] args) {
		method_Day2 obj=new method_Day2();
		int sumresult=obj.sum(12, 20);
		int subresult=obj.sub(200, 150);
		obj.multi(sumresult, subresult);
		
		
	}

}
