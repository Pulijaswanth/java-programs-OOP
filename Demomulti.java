//Inheritance and interface at the same time exmaple
interface One
{
	void show();
}
interface Two extends One
{
	void display();
}
class Demo1
{
	void print()
	{
		System.out.println("Parent class method");
	}
}
class Demomulti extends Demo1  implements One,Two
{
	public void show()
	{
		System.out.println("One interface");
	}
	public void display()
	{
		System.out.println("Two interface");
	}
}
class DemoMultipleinheritanceinterface
{
	public static void main(String[] args)
	{
	Demomulti ob=new Demomulti();
	ob.show();
	ob.display();
	ob.print();
	}
}