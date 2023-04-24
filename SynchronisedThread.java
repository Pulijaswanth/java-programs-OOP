class Resource{
	synchronized void display(int no)
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
		System.out.println("Welcome");
	}
}
class Thread1 extends Thread
{
	Resource obj;
	Thread1(Resource ob)
	{
		obj=ob;
	}
	public void run()
	{
		obj.display(10);
	}
}
class Thread2 extends Thread
{
	Resource obj;
	Thread2(Resource ob)
	{
		obj=ob;
	}
	public void run()
	{
		obj.display(100);
	}
}
public class SynchronisedThread
{
	public static void main(String args [])
	{
		Resource ob=new Resource();
		Thread1 ob1=new Thread1(ob);
		Thread2 ob2=new Thread2(ob);
		ob1.start();
		ob2.start();
	}
}