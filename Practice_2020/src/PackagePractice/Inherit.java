package PackagePractice;

public class Inherit {

	public static void main(String[] args) {

	}
}

class a
{
	final int i = 10;
	static int p = 20;
	int r = 30;

	void test1()
	{
		System.out.println("in test 1");
	}
}

class b extends a
{
	int p= 25;
	void print()
	{
		System.out.println(this.p);
		System.out.println(super.p);

	}
}

class d 
{
	void print2()
	{
		System.out.println(a.p);
//		System.out.println(i);
	}
}






