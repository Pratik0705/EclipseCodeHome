package PackagePractice;

public class interfaceNew {

	public static void main(String[] args) {
		cl1 obj = new cl1();
		//		obj.abc();		
		intr1.abc();
	}
}

interface intr1
{
	static int i=0;
	abstract void method1();
	static void abc()
	{
		System.out.println("in interfaces method");
	}
}
interface intr2 extends intr1
{
	int z = 11;
}
interface intr3 {
	int c = 44;
	void method2();}
class cl1 implements intr1, intr3
{
	public void method1()
	{
		System.out.println(intr1.i);
		System.out.println(i);
		intr1.abc();
	}
	public void method2()
	{
		System.out.println("in method2");
	}
}




































