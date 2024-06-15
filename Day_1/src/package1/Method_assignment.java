/*
 Assignment1
 (((((10+2)+2)-2)*2)/2)
 four methods required--- sum, sub, multi, divi
 here we will create sum method only once, but we will call that method twice
 from the main method
 int sumResult=obj.sum(10,2);
 int sumResult2=obj.sum(sumResult,2);
 int subResult=obj.sub(sumResult2,2);
 int multiReslt=obj.multi(subResult,2);
 obj.div(multiResult,2);
 */
package package1;

public class Method_assignment {
	public int sum(int a, int b)
	
	{
		int d;
		d= a+b;
		System.out.println("sum result :"+d);
		return d;
	}
	public int sub(int e, int f)
	{
		int g;
		g = e-f;
		System.out.println("sub result: "+g);
		return g;
	}
	public int multi(int h, int i)
	{
		int k;
		k = h*i;
		System.out.println("multi result: "+k);
		return k;
	}
	public int div(int l, int m)
	{
		int n;
		n = l/m;
		System.out.println("div result: "+n);
		return n;
	}
	public static void main(String[] args) {
		
		Method_assignment obj=new Method_assignment();
		int sumresult=obj.sum(10,2);
		int sumresult2=obj.sum(sumresult, 2);
		int subresult=obj.sub(sumresult2,2);
		int multireslt=obj.multi(subresult,2);
		obj.div(multireslt,2);
		
		
				
	}
	

}
