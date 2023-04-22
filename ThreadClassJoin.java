// Creat A thread to
class DemoThreadJoin extends Thread
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
				System.out.println(ob);
			}
		}
	}
}
class ThreadClassJoin
{
	public static void main(String[] args)
	{
		DemoThreadJoin ob1=new DemoThreadJoin ();
		DemoThreadJoin ob2=new DemoThreadJoin();
		DemoThreadJoin ob4=new DemoThreadJoin();
		ob1.start();
		try{
			ob1.join();
		}
		catch(Exception ob3)
		{
			System.out.println(ob3);
		}
		ob2.start();
		ob4.start();
	}
}