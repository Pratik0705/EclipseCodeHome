package PackagePractice;

public class finalDemo {

	final int s = 77; int p = 33; 
	public static void main(String[] args) 
	{
		final int a = 10;
		System.out.println("value of final : "+a);
		ab aa = new ab();
		aa.print();
		
	}
	
	void myFinal()
	{
		final int a = 10;
		System.out.println("value of final : "+a);
		
	}

}

class ab extends finalDemo
{
	void print()
	{
		myFinal();
		System.out.println(s);
		super.p = s;
		p++;
		System.out.println(p);
		super.s = 55;
	}
}







