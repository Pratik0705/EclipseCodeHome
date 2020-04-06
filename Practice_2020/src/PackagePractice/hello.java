package PackagePractice;

public class hello {

	public static void main(String[] args) {
		System.out.println("My first program");
		int p =10;
		if(p==1)
		{
			System.out.println("inside IF");
		}
		else if(p==2)
		{
			System.out.println("inside ELSE-IF");
		}

		else
		{
			System.out.println("inside ELSE");
		}

		String s = "Monnday";

		switch(s)
		{
		case "Monday": System.out.println("1st case"); break;
		default: System.out.println("default");break; 
		case "Tuesday": System.out.println("2nd case");

		}

		switch(p)
		{
		case 10 : System.out.println("case 1"); break;
		case 20 : System.out.println("case 2"); break;
		default : System.out.println("default");
		}
		for(int i=0;i<=5;i++)
		{if (i==3)
		{
			continue;
		}
		System.out.println(i);
		}

		int []t = {12,20};
		//		System.out.println(t[0]);
		for(int f=0;f<t.length;f++)
		{
			System.out.println("p"+t[f]);
		}


		//		*** fibonaci ***

		int n = 10, t1 = 0, t2 = 1;
		System.out.print("First " + n + " terms: ");

		for (int i = 1; i <= n; ++i)
		{
			System.out.print(t1);

			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		
		String s1 = "abc";
		StringBuilder sb = new StringBuilder(s1);
		System.out.println(sb.reverse());
		
		
	}


}

