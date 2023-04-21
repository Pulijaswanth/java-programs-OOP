//creating a thread by extending thread class
class DemoThread extends Thread
{
	public void run()
	{
		int no;
		for(no=1;no<=100;no++)
		{
			System.out.println(no);
		}
			
	}
}
class TestThreadClass
{
	public static void main(String args[])
	{
		DemoThread ob1=new DemoThread();//thread1 enters to new state
		DemoThread ob2=new DemoThread();//thread2 enters to new state
	    DemoThread ob3=new DemoThread();//thread3 enters to new state
		ob1.start();//Thread1 enters to runnable
	   ob2.start();//Thread2 enters to runnable
		ob3.start();//Thread3 enter to runnable
	}
}