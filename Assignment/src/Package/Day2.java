//(((((10+2)+2)-2)*2)/2)
package Package;
public class Day2 {
	public int sum(int a, int b )
	{
		int c;
		c= a+b;
		System.out.println("sum of the digits " + c);
		return c;
	}
	public int sub(int x, int y)
	{
		int z;
		z= x-y;
		System.out.println("sub of the digits " + z);
		return z;
	}
	public int multi(int j, int k)
	{
		int l;
		l= j*k;
		System.out.println("multi of the digits " + l);
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
		Day2 Arth =new Day2();
		int sumResult= Arth.sum(10,2);
		int sumResult1= Arth.sum(sumResult,2);
		int subResult= Arth.sub(sumResult1,2);
		int multiResult= Arth.multi(subResult,2);
		Arth.div(multiResult,2);
		
	}
	
	

}
