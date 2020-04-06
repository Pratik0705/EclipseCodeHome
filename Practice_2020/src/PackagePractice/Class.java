package PackagePractice;

public class Class 
{
	public static void main(String[] args) 
	{
		ClassDemo1 dm = new ClassDemo1();
		int a = dm.add();
		System.out.println(a);
		int []z;
		z=new int[4];
		z[0]=10;
		int []p={22,23,24,25};
		System.out.println(p[1]);
		
		
		
	}

}


class ClassDemo1
{
	int add()
	{
		int a =10, b=20;
		int c = a+b;
//		System.out.println(c);
		return c;
	}
}
