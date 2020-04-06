package PackagePractice;
import java.util.*;

public class ArrayListP {

	public static void main(String[] args) 
	{
		//		ArrayList al = new ArrayList();
		ArrayList<String> al=new ArrayList<String>();
		al.add("p");
		al.add("r");
		System.out.println(al);
		al.add(2, "a");
//		al.remove(1);
		System.out.println(al);

		ArrayList<String> ss= new ArrayList<String>();
		ss.add("g");
		ss.add("dd");
		al.addAll(ss);
		System.out.println(al+"**@@");
//		al.removeAll(ss);
		al.remove(3);
		System.out.println(al);
		
		LinkedList ll = new LinkedList();
		ll.add(11);
		ll.add("p");
		ll.add(2, 14);
		System.out.println(ll);
		ll.add(ss);
		System.out.println(ll+ "***");
		ll.add(4,55);
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);

		LinkedList ll2 = new LinkedList();
		ll2.add(00);
		ll2.add("ZZ");
		ll2.add(ll);
		System.out.println(ll2);
		al.addAll(ll2);
		ll2.addFirst("pratik");
		ll2.addLast("Yes");
		ll2.get(2);
		ll2.getFirst();
		ll2.size();
		System.out.println(ll2);
		
		Vector v = new Vector();
		v.add(10);
		v.add(1, "ve");
		System.out.println(v);
		v.add(ll);
		System.out.println(v);
		v.add(555);
		System.out.println(v);
		v.remove(2);
		System.out.println(v);
		
		Vector vv = new Vector();
		vv.add("ss");
		vv.add(v);
		vv.add(10);
		System.out.println(vv);
		vv.remove(1);
		System.out.println(vv);
		
		Stack s = new Stack();
		s.add(10);
		s.push("p");
		System.out.println(s.peek());
		System.out.println(s);
//		s.remove(0);
		s.pop();
		System.out.println(s + "Hash set : ");
		
		/////////// ************* SET ************* ///////////
		
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add("pr");
		hs.add(4);
		hs.add("a");
		hs.add(s);
		hs.add(4);
		hs.add(4);
		System.out.println(hs);
//		hs.remove("pr");
		System.out.println(hs+"hash set");
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(10);
		lhs.add(5);
		lhs.add(20);
		lhs.add(30);
		lhs.add("p");
		lhs.add(hs);
		System.out.println(lhs);
//		lhs.remove("p");
		System.out.println(lhs.add(10)); // no duplicates allowed
		System.out.println(lhs+"linked hash set");
		
		SortedSet st = new TreeSet();
		
		TreeSet ts = new TreeSet();
		ts.add(4);
		ts.add(78);
		ts.add(41);
//		ts.add(a); Heterogenious values not allowed
		System.out.println(ts.add(4)); //Heterogenious values not allowed
		System.out.println(ts);
		
		
		////////// *************  MAP  ************* //////////
		
		HashMap hm = new HashMap();
		hm.put(01, 125);
		hm.put(04,"pp");
		hm.put(02, 145);
		System.out.println(hm);
//		O/P : {1=125, 2=145, 4=pp}
		Hashtable ht = new Hashtable();
		ht.put(10, 88);
		ht.put(8, "l");
		System.out.println(ht);
		
//		hm
		
		TreeMap tm = new TreeMap();
		tm.put(10, 10);
		tm.put(2, "ll");
		tm.put(41, "o");
		tm.put(31, 41);
		System.out.println(tm);
		
		
		
		
		
		
		
		
		
	}

}
