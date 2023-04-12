//Run time polymorphism
class FirstOverride
{
	void show()
	{
		System.out.println("Base class");
	}
}
class SecondOverride extends FirstOverride
{
	void show()
	{
		System.out.println("Derived class");
	}
}
class Overriding 
{
	public static void main(String args[])
	{
		FirstOverride obj;//instance of class
		obj=new SecondOverride();
		obj.show();
		obj=new FirstOverride();
		obj.show();
	}
}
