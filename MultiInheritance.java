//Interface and multipleinheritance
interface One
{
	void show();
}
interface Two extends One
{
	void display();
}
class Demo implements Two,One
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
class DemoMultipleinheritance
{
	public static void main(String[] args)
	{
	Demo ob=new Demo();
	ob.show();
	ob.display();
	}
}