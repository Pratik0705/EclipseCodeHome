package PackagePractice;

import java.util.HashMap;
import java.util.Iterator;

public class collectionPrac {

	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(10, 11);
		hm.put(5, 41);
		hm.put(12, 51);
		hm.put(2, 97);


		for(int i : hm.keySet())
		{
			System.out.println("keys are : "+i);
		}

		for (int j : hm.values())
		{
			System.out.println("Values are : "+j);
		}
		
		Iterator <HashMap.Entry<Integer,Integer>> itrr = hm.entrySet().iterator();
		
		while(itrr.hasNext())
		{
			HashMap.Entry<Integer,Integer> etr = itrr.next();
			System.out.println("key is : "+etr.getKey()+"  value is : "+etr.getValue());
			
		}
		
	}

}
