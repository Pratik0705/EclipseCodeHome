package PackagePractice;

import java.util.Scanner;

public class stringOprt1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a row : ");
		String ss = sc.nextLine();
		String ssN = ss.replaceAll(" ", "");
		System.out.println("length of the string is : "+ssN.length());

		System.out.println("Enter a String : ");
		String p = sc.nextLine();
		System.out.println("Enter start and end number (ex. 1,3) for a sub-string : ");
		String pp = sc.nextLine();
		String[]si = pp.split(",");
		int[]ssint = new int[si.length];
		//		int[]si = new int[pp.length()];
		for(int i=0;i<si.length;i++)
		{
			ssint[i] = Integer.parseInt(si[i]);
		}
		for(int i=0;i<ssint.length;i++)
		{
			System.out.print(ssint[i]);
		}
		System.out.println("");
		String sub = p.substring(ssint[0], ssint[1]);
		System.out.println(sub);

		System.out.println("enter a string 2 : ");
		String g1 = sc.nextLine();
		char [] strarr = new char[g1.length()];
		for(int i=0;i<strarr.length;i++)
		{
			strarr[i] = g1.charAt(i);
		}
		
		for(int i=0;i<strarr.length;i++)
		{
			System.out.println(strarr[i] );
		}



	}
	private static int[] tointegerArray(String pp) {
		// TODO Auto-generated method stub
		return null;
	}

}
