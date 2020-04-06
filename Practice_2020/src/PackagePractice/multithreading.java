package PackagePractice;

public class multithreading {

	public static void main(String[] args) {
		for (int i=0;i<5;i++)
		{
			threads th = new threads();
			th.start();
			
			Thread obj = new Thread(new threads1());
			obj.start();
		}
	}
}
class threads extends Thread
{
	public void run()
	{
		System.out.println("current thread is : "+Thread.currentThread().getId());
	}
}

class threads1 implements Runnable
{
	public void run()
	{
		System.out.println("current running thread in interface is : "+Thread.currentThread().getId());
	}
}