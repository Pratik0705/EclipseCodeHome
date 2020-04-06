package PackagePractice;

public class staticUse 
{
	static int b;
	static staticUse su = new staticUse();
	public static void main(String[] args) 
	{
		int q = 55;
		System.out.println("b is : "+b);
		//		staticUse su = new staticUse();
		su.add();
		staticUse.test();
		test();
	}

	static
	{
		System.out.println("I am in static block");
		int a = 10;
		System.out.println("in static block a : "+a);

	}

	static void test()
	{
		int f = 78;
		System.out.println("value of B is "+b);
		b = 55;

	}

	void add()
	{
		System.out.println("in add");
		b=85;
		test();
	}
}

class aab
{
	//	staticUse.test();
	//	staticUse.b = 10;
	public void aa()
	{
		staticUse.test();
		staticUse.b = 11;
		staticUse suq = new staticUse();
		suq.add();
		suq.test();
		staticUse.test();
	}

	static
	{
		System.out.println("static block of aab");
	}
}

























