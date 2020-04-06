package PackagePractice;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
//import org.apache.commons.lang3.ArrayUtils;

public class stringOprt2 {

	public static void main(String[] args) 
	{
		stringOprt2 pm = new stringOprt2();
		pm.Palimrom2();
		pm.swapStrings();
		pm.removeDuplicates();
		pm.usernameValidation();
		pm.tokenString();
		pm.palimrom();
		pm.numberPalCheck();
		List<String>reqr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string : ");
		String main = sc.nextLine();
		main = main.replaceAll(" ", "");

		String req = main.substring(0, 3);// starts with 0 and end b4 3rd element (0,1,2)
		reqr.add(req);

		for(int i=1;i<main.length();i++)
		{
			for (int j=i*3;j<i*4;j++)
			{
				for (int k=j+3;k<main.length();k++)
				{
					//					System.out.println(" "+j+" "+k);
					//					System.out.println(main.substring(j,k));
					reqr.add(main.substring(j,k));
					break;
				}break;
			}
		}

		System.out.println(reqr);
		int p = reqr.size();
		System.out.println("1st set is : "+reqr.get(0));
		System.out.println("Last set is : "+reqr.get(p-1));



	}
	void palimrom()
	{
		System.out.println("Enter a string to check palimrom : ");
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();

		StringBuilder sb = new StringBuilder();
		sb.append(inp);

		StringBuilder temp = sb.reverse();
		String rev = temp.toString();

		if(rev.equals(inp))
		{
			System.out.println("String is palimrom");
		}
		else
		{
			System.out.println("not a palimrom");
		}
	}












	void numberPalCheck()
	{
		System.out.println("enter a number to check palimron : ");
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();

		StringBuilder sb = new StringBuilder();
		sb.append(s1);

		StringBuilder temp = sb.reverse();





	}

	void tokenString()
	{
		System.out.println("Enter a sentence : ");
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();

		String[] strar = ss.split(" ");
		System.out.println(strar.length);
		for(int i=0;i<strar.length;i++)
		{
			System.out.println(strar[i]);
		}

	}

	void usernameValidation()

	{
		System.out.println("Enter user names : ");
		Scanner sc = new Scanner(System.in);
		String sc1 = sc.nextLine();
		String[] ip = sc1.split(" ");

		for(int i=0; i<ip.length;i++)
		{
			String temp = ip[i];
			if(temp.length()>=8)
			{
				System.out.println("Check 1 : pass : length greater than 8 ");
				char[] cr = new char[temp.length()];
				for(int j=0;j<cr.length;j++)
				{
					cr[i]=temp.charAt(i);

				}
				Character c1 = cr[0];
				if(!Character.isDigit(c1))
				{
					System.out.println("Check 2 : pass : 1st letter is not alphabet ");
				}
				else
				{
					System.out.println("fail : check 2 : 1st letter is not alphaber");
				}
			}
			else
			{
				System.out.println("fail : check 1 : length less than 8");
			}

		}
	}

	void removeDuplicates()
	{
		System.out.println("Enter a string with some duplicate words : ");
		Scanner sc = new Scanner(System.in);
		String scin = sc.nextLine();
		String[] input = scin.split(" ");

		HashSet<String> al = new HashSet<>();// doesnt accepts duplicates

		for(int i=0;i<input.length;i++)
		{
			al.add(input[i]);
		}

		System.out.println(al);
		//
		//		String[]strnew = new String[input.length];
		//		String []temp = new String[strnew.length];
		//		int k =0;
		//		for(int i=0; i<input.length-1;i++)
		//		{				
		//			if(!(input[i].equals(input[i+1])))
		//			{
		//				temp[k++] = input[i];			
		//			}
		//		}

		//		System.out.println("array without duplicates is : ");
		//		for(int i=0;i<temp.length;i++)
		//		{
		//			System.out.println(temp[i]);
		//		}

	}

	void swapStrings()
	{
		String a1 = "abc";
		String a2 = "pqr";

		ArrayList<String> als1= new ArrayList<>();
		als1.add(a1);
		ArrayList<String> als2 = new ArrayList<>();
		als2.add(a2);
		System.out.println("1st string : "+als1.get(0)+"     2nd string : "+als2.get(0));
		als2.addAll(als1);//pqr, abc
		als1.addAll(als2);// abc, pqr abc

		als2.remove(1);
		als1.remove(1);
		//		als1.remove(2);

		System.out.println(als1.get(0)+"  "+als2.get(0));


	}

	void Palimrom2()
	{
		System.out.println("Enter a string to check palimrom : ");
		Scanner sc = new Scanner(System.in);
		String cr = sc.nextLine();
		String [] str = cr.split("");
		char [] rev = new char[str.length];
		char[] cra = cr.toCharArray();
		int j =0;
		for (int i=cra.length-1; i>=0;i--)
		{
			rev[j++]=cra[i];//reverse char array(original word)
		}
		String temp="";
		for(int k=0;k<cra.length;k++)
		{
			temp = temp+rev[k];//char array to string convert
		}
		System.out.println(temp);

		if(cr.equals(temp))// compare
		{
			System.out.println("it is palimrom");
		}
		else
		{
			System.out.println("not a palimrom");
		}




	}






}







