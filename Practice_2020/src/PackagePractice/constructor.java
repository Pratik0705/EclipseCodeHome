package PackagePractice;

public class constructor 
{
	public static int i;

	public static void main(String[] args) 
	{
		constructor cc = new constructor();
		System.out.println("values of i is : "+i);
		cc = new constructor(11);
		System.out.println("values of i is : "+i);


	}

	constructor()
	{
		System.out.println("in constructor!!!");
	}

	private constructor(int a)
	{
		i = a;
		System.out.println("in constructor 2");
	}

}

class abc
{
	constructor cc = new constructor(g);
	int g = 4;
	//	cc = new constructor(g);


}