class Resource2{
	static synchronized void display(int no)
	{
		for(int index=1;index<=5;index++)
		{
			try
			{
				System.out.println(index*no);
				Thread.sleep(1000);
			}
			catch(Exception ob)
			{
				System.out.println(ob);
			}
		}
		System.out.println("bye");
		System.out.println("over");
	}
}
class Thread13 extends Thread
{

	public void run()
	{
		Resource2.display(10);
	}
}
class Thread23 extends Thread
{
	public void run()
	{
		Resource2.display(100);
	}
}
class Thread33 extends Thread
{
	public void run()
	{
		Resource2.display(5);
	}
}
class Thread43 extends Thread
{
	public void run()
	{
		Resource2.display(1000);
	}
}

public class StaticSynchronization
{
	public static void main(String args [])
	{
		Resource2 ob=new Resource2();
		Thread13 ob1=new Thread13();
		Thread23 ob2=new Thread23();
		Thread33 ob3=new Thread33();
		Thread43 ob4=new Thread43();
		ob1.start();
		ob2.start();
		ob3.start();
		ob4.start();
	}
}
