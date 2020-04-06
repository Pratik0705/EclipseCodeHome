package PackagePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {

		int a[] = new int[5];
		a[1]=100;
		a[4]=500;
		for (int i=0;i<a.length;i++)
		{
			System.out.println("value :  " +a[i]);
		}

		char p[]={'p', 'r', 'a'};
		for (int j=0; j<p.length;j++)
		{
			System.out.println(p[j]);
		}

		int []d = new int[20];
		int g = d.length;

		ArrayList <String> al1 = new ArrayList<>();
		al1.add("abc");
		ArrayList <String> al2 = new ArrayList<>();
		al2.add("pqr");
		System.out.println("al1 : "+al1);
		System.out.println("al2 : "+al2);
		al1.addAll(al2); //abc, pqr
		al2.addAll(al1); // pqr, abc pqr

		al1.remove(0);
		al2.remove(0);
		al2.remove(1);

		System.out.println("al1 : "+al1);
		System.out.println("al2 : "+al2);
		String s = al1.get(0);
		char []h = s.toCharArray();

		int []k = new int [6];
		for (int n=0;n<k.length;n++)
		{
			k[n]=n;
		}
		k[5]=6;
		for (int r=0;r<k.length;r++)
		{
			System.out.println(k[r]);
		}
		//		System.out.println();
		//		ArrayList <Integer> ait = new ArrayList<>();
		//		List al = Arrays.asList(k);
		//		ait.addAll(al);
		//		System.out.println(al);

		System.out.println("3rd highest of array");

		int []x = {10,5,8,11,52,30};

		for (int i=0; i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					int temp;
					temp=x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}

		for(int q=0;q<x.length;q++)
		{
			System.out.println(x[q]);
		}


		ArrayList <Integer> aa = new ArrayList<>();
		for(int y : x)
		{
			aa.add(y);
		}

		System.out.println(aa);
		System.out.println("third highest element of array is : "+aa.get(2));

		int s1 = 55;
		switch (s1)
		{
		case 1 : 
			s1 = 50;
			System.out.println("s1 is 50");
			break;
			
		case 2 : 
			s1 = 55;
			System.out.println("s1 is 55");
			break;
			
		case 3 :
			s1 = 65;
			System.out.println("s1 is 65");

		}

int[]prt = new int[10];
String gg = "jcksj";
gg.length();


























	}

}
