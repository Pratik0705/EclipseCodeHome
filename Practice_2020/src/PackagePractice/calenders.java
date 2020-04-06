package PackagePractice;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class calenders {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		System.out.println("current date is : "+cl.getTime());

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the date (dd-mm-yyyy) : ");
		String ss = sc.nextLine();
		List<Integer> dc = new ArrayList<>();
		String[]a = ss.split("-");
		int []fin = new int[a.length]; 

		for(int i=0;i<fin.length;i++)
		{
			fin[i]=Integer.parseInt(a[i]);
		}

		for(int j=0;j<fin.length;j++)
		{
			System.out.print(fin[j]);
		}

		for(int p=0;p<fin.length;p++)
		{
			dc.add(fin[p]);
		}
		System.out.println(dc);
		
		
		
	}

}
