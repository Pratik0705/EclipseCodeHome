package PackagePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class collectionPractive {

	public static void main(String[] args) 
	{		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10); al.add(55); al.add(5);
		int a = al.get(2);
		al.add(1,777);
		System.out.println(a);
		System.out.println(al);
		
//		ListIterator<Integer> lit = al.iterator();
		

		LinkedList <Integer> ll = new LinkedList<>();
		ll.add(12);
		ll.add(2);
		ll.add(44);
		ll.add(1);
		//		ll.remove(44);
		System.out.println(ll);

		int [] a1 = new int[ll.size()];

		for(int i=0;i<ll.size();i++)
		{
			a1[i]=ll.get(i);
		}


		char []p={'s','f','a','q','m'};
		List cs  = Arrays.asList(p);

		ArrayList<Character> alc = new ArrayList<>();
		for(char x : p)
		{
			alc.add(x);
		}
		System.out.println(alc);

		String []ss = {"sasas","dfd","poi","qwq"};
		ArrayList <String> als = new ArrayList<>(Arrays.asList(ss));

		System.out.println(als);

		Character []ch ={'d','a'};
		ArrayList<Character> ac = new ArrayList<>(Arrays.asList(ch));

		HashSet <Character> hs = new HashSet<>(Arrays.asList(ch));

		HashSet<Character> hs2 = new HashSet<>();

		for (char sc : p)
		{
			hs2.add(sc);
		}
		System.out.println("hash set is : " +hs2);

		char []hs2Toarr = new char[hs2.size()];



		Iterator it = hs2.iterator();

		for(int j=0;j<hs2.size();j++)
		{
			hs2Toarr[j] = (char) it.next();
		}
		for(int j=0;j<hs2.size();j++)
		{
			System.out.println("final array content : "+hs2Toarr[j]);
		}

		//		alc.toArray();
		char []ffc = new char[ac.size()];

		//		for (Character ff : ac)
		//		{
		//			Arrays.fill(ffc, ff);
		//		}
		//		
		//		for(int i=0;i<ac.size();i++)
		//		{
		//			System.out.println(ffc[i]);
		//		}
		//		



		for(int i = 0;i<ac.size();i++)
		{
			ffc[i] = ac.get(i);
		}

		for(int i=0;i<ac.size();i++)
		{
			System.out.println(ffc[i]);
		}


		LinkedHashSet <Integer>lhs = new LinkedHashSet<>();
		//		lhs.a

		Iterator itt = al.iterator();

		
		

















	}

}
