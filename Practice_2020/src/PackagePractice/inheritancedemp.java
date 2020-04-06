package PackagePractice;

public class inheritancedemp extends calc{

	public static void main(String[] args) {
		inheritancedemp pp = new inheritancedemp();
		pp.sum(10, 20);
	}

}
class calc
{
	public void sum(int a, int b)
	{
		int addtn = a+b;
		System.out.println("sum "+addtn);
	}
}