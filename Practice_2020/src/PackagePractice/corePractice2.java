package PackagePractice;



public class corePractice2 {

	public static void main(String[] args) 
	{
		parent p = new parent();
//		ch.c1();
//		ch.p1();
//		ch = (child) new parent();
		p = new child();
		encap1 ec = new encap1();
		

	}

}

class parent
{
	static String s = "String test";
	public int i=10; 
	protected int j=10;
	final int q = 22;

	final void p1()	{
		int p2 = 4;
		System.out.println("in p1"+p2+ "  "+s+"  "+i);
	}

	private void p2()	{
		System.out.println("in p2");
	}
}
class child extends parent
{
	void c1()	{
		System.out.println("Child : c1 "+parent.s);
	}
	final int i = 20; // changed parent variables access modifier
	public int j = 68; // changed parent variables access modifier

	public void p2() // changed parent variables access modifier
	{
		System.out.println("made parentsmethos public"+j);
	}
}














