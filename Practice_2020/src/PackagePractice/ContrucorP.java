package PackagePractice;

public class ContrucorP 
{
	ContrucorP() //Constructor should be inside the class
	{
		System.out.println("in constructor");
	}

	public static void main(String[] args) 
	{
		pp p = new pp();
	}

}

class pp
{
	ContrucorP cp = new ContrucorP();
}
