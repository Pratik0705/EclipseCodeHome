package PackagePractice;

import java.util.Arrays;
import java.util.Scanner;

public class subStringNumbers {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s1 = sc.nextLine();
		System.out.println("enter 1st number : ");
		int p1 = sc.nextInt();
		System.out.println("enter 2nd number : ");
		int p2 = sc.nextInt();
		int g = s1.length();
		char []proc = new char[g];
		for (int b =0; b<s1.length();b++)
		{
			proc = s1.toCharArray();
		}
		//		for (int b =0; b<s1.length();b++)
		//		{
		//			System.out.println(proc[b]);
		//		}
		System.out.println("break points are : " +p1+" & "+p2 );
		for (int i=0;i<proc.length;i++)
		{
			if(i==p1-1)
			{
				for(int z=i;z<p2;z++)
				{
					System.out.println(proc[z]);
				}
			}
		}

		System.out.println("enter a string : ");
		Scanner sc1 = new Scanner(System.in);
		String ss = sc1.nextLine();
		char []aa = ss.toCharArray();
		Arrays.sort(aa); 
		String sa = null; String sb = null;
		for (int f = 0;f<aa.length;f++)
		{
			sa = Character.toString(aa[f]);
			sb=sb+sa;
		}
		System.out.println(sb);


	}

}
