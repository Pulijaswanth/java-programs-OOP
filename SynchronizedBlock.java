class Resource1{
	void display(int no)
	{
		System.out.println("Welcome");
		synchronized(this)//Synchronized block
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
		}
	}
}
class Thread11 extends Thread
{
	Resource1 obj;
	Thread11(Resource1 ob)
	{
		obj=ob;
	}
	public void run()
	{
		obj.display(10);
	}
}
class Thread21 extends Thread
{
	Resource1 obj;
	Thread21(Resource1 ob)
	{
		obj=ob;
	}
	public void run()
	{
		obj.display(100);
	}
}
public class SynchronizedBlock
{
	public static void main(String args [])
	{
		Resource1 ob=new Resource1();
		Thread11 ob1=new Thread11(ob);
		Thread21 ob2=new Thread21(ob);
		ob1.start();
		ob2.start();
	}
}
