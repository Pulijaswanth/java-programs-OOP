//creating a thread by extending thread class
class DemoThreadClass extends Thread
{
	public void run()
	{
		int no;
		for(no=1;no<=10;no++)
		{
			try
			{
				System.out.println(no);
				Thread.sleep(1000);
			}
			catch(Exception ob)
			{
			}
		}
			
	}
}
class TestThreadClassDemo
{
	public static void main(String args[])
	{
		DemoThreadClass ob1=new DemoThreadClass();//thread1 enters to new state
		DemoThreadClass ob2=new DemoThreadClass();//thread2 enters to new state
	    DemoThreadClass ob3=new DemoThreadClass();//thread3 enters to new state
		ob1.start();//Thread1 enters to runnable
	   ob2.start();//Thread2 enters to runnable
		ob3.start();//Thread3 enter to runnable
	}
}