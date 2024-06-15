//(((((10*2)+2)-2)*2)/2)

package package1;

public class method_Assignmet2 {
	public int multi(int a, int b)
	{
		int c;
		c= a*b;
		System.out.println("MultiResult: "+c);
		return c;
	}
	public int sum(int d, int e)
	{
		int f;
		f= d+e;
		System.out.println("sumResult: "+f);
		return f;
	}
	public int sub(int g, int h)
	{
		int k;
		k=g-h;
		System.out.println("SubResult: "+k);
		return k;
	}
	public int div(int m, int n)
	{
		int j;
		j=m/n;
		System.out.println("divResult: "+j);
		return j;
	}
	public static void main(String[] args) {
		method_Assignmet2 arth=new method_Assignmet2();
		int Multiresult=arth.multi(10,2);
		int SumResult=arth.sum(Multiresult, 2);
		int SubResult=arth.sub(SumResult, 2);
		int Multiresult2=arth.multi(SubResult, 2);
		arth.div(Multiresult2, 2);
		
		
	}

}
