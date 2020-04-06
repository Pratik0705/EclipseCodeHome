package PackagePractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class collectionPractice {

	public static void main(String[] args) 
	{
		int []p = {10,2,8,1,55};
		HashSet <Integer> hs = new HashSet<>(p.length);
		LinkedHashSet <Integer> hs2 = new LinkedHashSet<>(p.length);
		for(int i=0;i<p.length;i++)
		{
			hs.add(p[i]);
		}

		System.out.println("hs is "+hs);


		for(int d : p)
		{
			hs2.add(d);
		}

		System.out.println("linked hs2 : "+hs2);

		TreeSet <Integer> ts = new TreeSet<>();

		ts.addAll(hs);
		System.out.println(hs);

		PriorityQueue <Integer> pq = new PriorityQueue<>();
		//		pq.addAll(hs2);
		pq.add(5); pq.add(2); pq.add(8); 
		//		pq.add(null);
		System.out.println("PQ : "+pq);
		System.out.println(pq.peek());

		PriorityBlockingQueue <Integer> pqu = new PriorityBlockingQueue<>();
		pqu.addAll(pq);
		System.out.println(pq);
		//		pqu.add(null);
		//		System.out.println("pbq : "+pqu);

		LinkedBlockingQueue <Integer> lbq = new LinkedBlockingQueue<>();
		lbq.addAll(pqu);
		//		lbq.add(null);
		System.out.println("lbq is : "+lbq);

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(10, "one");
		hm.put(1, "two");
		hm.put(null, "1st null key");
		hm.put(null, "2nd null key");
		hm.put(4, null);
		hm.put(8, null);

		System.out.println(hm);

		HashMap<Integer, Integer> hm2 = new HashMap<>();
		hm2.put(10, 55);
		hm2.put(1, 21);
		hm2.put(2, null);
		System.out.println(hm2);
		System.gc();
		System.out.println(hm2);

		int [][]hmar = new int[hm2.size()][hm2.size()];

		//		for (int i=0;i<hmar.length;i++)
		//		{
		//			for(int j=0;j<hmar.length;j++)
		//			{
		//				hmar[i][j] = hm2.get(i);
		//			}
		//			
		//		}
		//		for (int i=0;i<hmar.length;i++)
		//		{
		//			for(int j=0;j<hmar.length;j++)
		//			{
		//				System.out.println("hmar : "+hmar[i][j]);
		//			}
		//			
		//		}

		WeakHashMap<String, Integer> numbers = new WeakHashMap<>();

		String two = new String("Two");
		Integer twoValue = 2;
		String four = new String("Four");
		Integer fourValue = 4;

		// Inserting elements
		numbers.put(two, twoValue);
		numbers.put(four, fourValue);
		numbers.put(null, 11);
		numbers.put(null, 12);
		numbers.put("1st null val",null);
		numbers.put("2nd null val",null);

		System.out.println("WeakHashMap: " + numbers);

		// Make the reference null
		two = null;

		// Perform garbage collection
		System.gc();

		System.out.println("WeakHashMap after garbage collection: " + numbers);

		//O/P
		//        WeakHashMap: {Four=4, Two=2}
		//        WeakHashMap after garbage collection: {Four=4}

		IdentityHashMap <String, Integer> ihm = new IdentityHashMap<>();

		String two1 = new String("Two");
		Integer twoValue1 = 2;
		String four1 = two1;// refer to same mem. loc.
		Integer fourValue1 = 4;
		ihm.put(null, 0705);
		ihm.put(two1, twoValue1);
		ihm.put(four1, fourValue1);
		ihm.put(four1, fourValue1);
		ihm.put(null, 14);
		ihm.put(null, 18);
		ihm.put("1st null val", null);
		ihm.put("1st null val", null);

//		Iterator it = ihm.iterator;
		
		System.out.println("Ihm 2nd : "+ihm);
		//O/P
		//Ihm 2nd : {Two=4} // hence only one added


		Hashtable <Integer, Integer> htb = new Hashtable<>();
		htb.put(11, 11);
		//		htb.put(11, null);
		//		htb.put(null, 11);
		htb.put(10, 11);
		System.out.println("Hash table values : "+htb);

		System.out.println(hm.get(1));
		System.out.println(hm.containsKey(10));
		System.out.println(hm.containsValue("two"));






	}

}
