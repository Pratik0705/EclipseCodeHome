package PackagePractice;

public class corePractice {
	public static void main(String[] args) {
		xyz x = new xyz();
	}
}
 abstract class abcd{
	abstract void add();
	abstract void add2();
	final void mult()	{
		System.out.println("in Mul method : abc");
	}
	abcd()	{
		System.out.println("abc's constructor");
	}
}
abstract class pqr extends abcd{
	void add()	{
		System.out.println("in add : pqr");
	}	
	pqr()	{
		System.out.println("pqr constructor!!!");
	}
}
class xyz extends pqr{
	void add2()	{
		System.out.println("in add 2 implementation : in xyz");
	}
	void add()	{
		System.out.println("in add : xyz. although its not compulsory");
	}
}

final abstract class test1
{
	
	abstract void tt();
	
	
}





























































































