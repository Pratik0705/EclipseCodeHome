package PackagePractice;

public class encapsul {

	public static void main(String[] args) 
	{
		//		encap1.name = "pp";
		encap1 en = new encap1();
		en.setName("Hii");
		System.out.println(en.getName());
		System.out.println(en.getAge());
		//		en.age = 10;
	}
}

class encap1
{
	private String name;
	private int age;

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public void setName(String sn)
	{
		name= sn;
		System.out.println("name changed to "+name);
	}
}

class encap2 extends encap1
{
	void test1()
	{
		//		sname = " ";
	}







}
