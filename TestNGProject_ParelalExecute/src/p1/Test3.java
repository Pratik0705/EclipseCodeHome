package p1;

import org.testng.annotations.Test;

public class Test3 {

	public class Test2 {

//		@Test(groups={"Regression"}, dependsOnGroups={"Sanity"})//group regression wil be executed only after executing sanity
		public void m7()
		{
			System.out.println("m7");
		}

//		@Test(groups={"Sanity"})//create a group
		public void m8()
		{
			System.out.println("m8");
		}

//		@Test(groups={"Regression"}, dependsOnGroups={"Sanity"})
		public void m9()
		{
			System.out.println("m9");
		}
	}


}
