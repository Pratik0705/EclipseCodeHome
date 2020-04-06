package PackagePractice;

public class StaticDemo 
{
	static int a,b;

	public static void main(String[] args) 
	{
		StaticDemo ds = new StaticDemo();
	}

	public static void mthd()
	{
		a=10; b=20;
		int c = a+b;

	}

}

class test
{
	StaticDemo.a = 25;
}
