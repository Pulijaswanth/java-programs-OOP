package Folder1;
class DemoAccessSpecifier
{
	private void m1()
	{
		System.out.println("Private");
	}
	public void m2()
	{
		System.out.println("public");
	}
	protected void m3()
	{
		System.out.println("protected");
	}
	void m4()
	{
		System.out.println("Default");
	}
	public static void main(String args[])
	{
		DemoAccessSpecifier ob=new DemoAccessSpecifier();
		ob.m1();
		ob.m2();
		ob.m3();
		ob.m4();
	}
}
