package PackagePractice;

public class Inheritance 
{
	public static void main(String[] args) 
	{
		parrot pp = new parrot();
		pp.sing();
		pp.eat();
		pp.fly();
		pp.a = 200;
		System.out.println(pp.a);

	}

}

class birds
{
	int a =100;
	public void fly()
	{ 
		System.out.println(a);
		System.out.println("birds can fly");
	}
}

class sparro extends birds
{
	public void eat()
	{
		System.out.println("sparro eats");
	}
}

class parrot extends sparro
{
	public void sing()
	{
		System.out.println("Parrot sings");
	}

}