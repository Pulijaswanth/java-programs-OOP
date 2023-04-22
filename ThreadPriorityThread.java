//how to get the current thread name in thread
class PriorityThreadName extends Thread
{
	
	public void run()
	{
		int no;
		for(no=1;no<=10;no++)
		{
			try
			{
				System.out.println(Thread.currentThread().getName()+" "+no);
				Thread.sleep(1000);
			}
			catch(Throwable ob)
			{
				System.out.println(ob);
			}
		}
	}
}
class ThreadPriorityThread
{
	public static void main(String[] args)
	{
		PriorityThreadName ob1=new PriorityThreadName ();
		PriorityThreadName ob2=new PriorityThreadName();
		PriorityThreadName ob3=new PriorityThreadName();
		System.out.println("name of thread-1 is "+ob1.getPriority());
		System.out.println("name of thread-2 is "+ob2.getPriority());
		System.out.println("name of thread-3 is "+ob3.getPriority());
		ob1.start();
		ob2.start();
		ob3.start();
		ob1.setName("T-1");
		ob2.setName("T-2");
		ob3.setName("T-3");
		ob1.setPriority(7);
		ob2.setPriority(2);
		ob3.setPriority(9);
		System.out.println(" After mod name of thread-1 is"+ob1.getName()+""+ob1.getPriority());
		System.out.println("After mod name of thread-2 is"+ob2.getName()+""+ob2.getPriority());
		System.out.println("After mod name of thread-3 is"+ob3.getName()+""+ob3.getPriority());
		ob1.setPriority(Thread.MAX_PRIORITY);
		ob2.setPriority(Thread.MIN_PRIORITY);
		ob3.setPriority(Thread.NORM_PRIORITY);
		System.out.println("Priority is "+ob1.getName()+" "+ob1.getPriority());
		System.out.println("Priority is "+ob2.getName()+" "+ob2.getPriority());
		System.out.println("Priority is "+ob3.getName()+" "+ob3.getPriority());
		
		
	}
}