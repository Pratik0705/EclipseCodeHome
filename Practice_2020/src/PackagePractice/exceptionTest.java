package PackagePractice;

import java.io.FileReader;
import java.io.IOException;
import java.rmi.AccessException;

public class exceptionTest {

	public static void main(String[] args) {
		try
		{
			int a = 10;
			int b = 0;
			int c = a/b; throw new IOException();
		}
		catch(Exception e)
		{
			System.out.println("exception");
		}
		test11 t11 = new test11();
		try {
			t11.testOne();
		} 
		catch (ArithmeticException | IOException e) // we can write (Exception e) as well
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class test11
{
	void testOne() throws IOException, AccessException, ArithmeticException
	{
		int z = 14/0;
	}

}

class abc1
{{	
	try
	{
		int z1 = 500/0;
		throw new IOException();
	}
	catch(Exception e)
	{
		System.out.println("exception");
	}
}}














