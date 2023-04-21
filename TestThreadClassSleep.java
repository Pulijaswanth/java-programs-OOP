//use of sleep
class DemoThreadSleep extends Thread
{
	public void run()
	{
		int no;
		for(no=1;no<=10;no++)
		{
			try
			{
				System.out.println(no);
				Thread.sleep(1000);//1000 milliseconds
			}
			catch(InterruptedException ob)
			{
				System.out.println(ob);
			}
		}
	}
}
class TestThreadClassSleep
{
	public static void main(String args[])
	{
		DemoThreadSleep ob1=new DemoThreadSleep();//Thread1 enters to new state
		DemoThreadSleep ob2=new DemoThreadSleep();//Thread2 enters to new state
		ob1.start();//thread1 enters to runnable state
		ob2.start();//thread1 enters to runnable state
	}
}