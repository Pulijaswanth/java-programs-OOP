//Overriding problem demonstartion
class First
{
	void show()
	{
		System.out.println("Base class");
	}
}
class Second extends First
{
	void show()
	{
		System.out.println("Derived class");
	}
}
class Driver
{
	public static void main(String args[])
	{
		Second ob=new Second();
        ob.show();
         ob.show();		
	}
}