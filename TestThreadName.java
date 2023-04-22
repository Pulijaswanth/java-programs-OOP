//Naming of thread

class DemoThreadName extends Thread
{
	public void run()
	{
		int no;
		for(no=1;no<=10;no++)
		{
			System.out.println(Thread.currentThread().getName()+" "+no);
			Thread.sleep(1000);
		}
	}
}
class TestThreadName
{
	public static void main(String args[])
	{
		DemoThreadName ob1 = new DemoThreadName();
		DemoThreadName ob2 = new DemoThreadName();
		DemoThreadName ob3 = new DemoThreadName();
		System.out.println("Name of thread-1 is "+ob1.getName());
		System.out.println("Name of thread-2 is "+ob2.getName());
		System.out.println("Name of thread-3 is "+ob3.getName());
		ob1.start();
		ob2.start();
		ob3.start();
		ob1.setName("Durga");
		ob2.setName("krupesh");
		ob3.setName("sunil");
		System.out.println("After modification Name of thread-1 is "+ob1.getName());
		System.out.println("After modification Name of thread-2 is "+ob2.getName());
		System.out.println("After modification Name of thread-3 is "+ob3.getName());
	}
}
