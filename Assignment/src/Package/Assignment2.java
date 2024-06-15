//(((((10*2)-2)+2)-2)/2)
package Package;
public class Assignment2 {
	public int multi(int a, int b )
	{
		int c;
		c= a*b;
		System.out.println("multiplication of the digits " + c);
		return c;
	}
	public int sub(int x, int y)
	{
		int z;
		z= x-y;
		System.out.println("subraction of the digits " + z);
		return z;
	}
	public int Add(int j, int k)
	{
		int l;
		l= j+k;
		System.out.println("Addition of the digits " + l);
		return l;
	}
	public int div(int f, int g)
	{
		int h;
		h= f/g;
		System.out.println("div of the digits " + h);
		return h;
	}
	public static void main(String[] args) {
		Assignment2 digit =new Assignment2();
		int multiResult=digit.multi(10, 2);
		int subResult=digit.sub(multiResult, 2);
		int sumResult=digit.Add(subResult, 2);
		int subResult1=digit.sub(sumResult, 2);
		digit.div(subResult1, 2);
	}
	}


