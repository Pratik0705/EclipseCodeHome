package PackagePractice;

public class Encapsulation 
{
	public static void main(String[] args) 
	{
		bank bb = new bank();
		bb.getBal();
		bb.setBal(1050);

	}

}

class bank
{
	private int balance = 485;
	
	public void getBal()
	{
		// write validation code here
		System.out.println("Your current balance is : "+ balance);
	}
	
	public void setBal(int a)
	{
		// write validation code here
		balance = a;
		System.out.println("Your new balance is : "+ balance);
	}
}