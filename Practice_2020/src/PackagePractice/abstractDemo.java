package PackagePractice;

public class abstractDemo 
{
	public static void main(String[] args) 
	{
		maths al = new algebra();
		al.calculate();
//		al.calculate12();// we can not have calculate2 here because it is undefined in maths.
		al = new geometry();
		al.calculate();
	}

}

abstract class maths
{
	int i = 10;
	abstract void calculate();
//	void calculate2(){}
}

class algebra extends maths
{
	void calculate()
	{
		System.out.println("in algebra : calculate"+i);
	}
	
	void calculate2()
	{
		System.out.println("in algebra : calculate2"+i);
	}
}

class geometry extends maths
{
	void calculate()
	{
		System.out.println("in geometry : calculate ");
	}
	
	void calculate3()
	{
		System.out.println("in geometry :calculate3");
	}
}


