package PackagePractice;

import java.util.Scanner;

public class controlFlow {

	public static void main(String[] args) 
	{
		int i=1;
		do
		{
			//			System.out.println(i);
			i++;
			System.out.println(i);
		}while(i<11);

		int p=50;
		while(!(p>60))
		{
			p++;
			if(p==55)
			{
				continue;
			}
			System.out.println(p);
		}

		//		Scanner sc = new Scanner(System.in);
		//		System.out.println("Enter day : ");
		//		String day = sc.nextLine();
		//
		//		switch(day)
		//		{
		//		case "Monday" : 
		//			System.out.println("it is monday");
		//			break;
		//
		//		case "Tuesday" : 
		//			System.out.println("it is tuesday");
		//
		//		}

		//		System.out.println("Enter a number : ");
		//		int a = sc.nextInt();
		//		switch (a)
		//		{
		//		case 1 :
		//			System.out.println("you entered One");
		//			break;
		//
		//		default : 
		//			System.out.println("No match for your entry");
		//		}

		Scanner scc = new Scanner(System.in);
		System.out.println("enter a number");
		int k = scc.nextInt();
		for(int i1=0;i1<11;i1++)
		{
			int s1 = k*i1;
			System.out.println(k+" * "+i1+" ="+s1);

		}

		int []a1 = new int[10];

		char c1 = 'p';
		String s2 = Character.toString(c1);
		System.out.println(s2);

		char[]cr ={'a','f','k'};
		String z=null; String h;
		for (int i1 =0;i1<cr.length;i1++)
		{
			h = Character.toString(cr[i1]);
			z= z+h;
		}
		System.out.println(z);

		String s4 = "Pratik";
		//		char[]cr1 = 
		char q = s4.charAt(0);
		System.out.println(q);
		for (int g=0; g<s4.length();g++)
		{
			char c11 = s4.charAt(g);
			System.out.println(g+"th character is : "+c11);
		}


		String s5 = "hello";

		char []v1= new char[10] ;
		for (int j =0;j<s5.length();j++)
		{
			v1 = s5.toCharArray();
		}

		for (int g=0;g<v1.length;g++)
		{
			System.out.println(v1[g]);
		}
		































	}

}
