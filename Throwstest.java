class TestThrows
{
	void f1() throws ArrayIndexOutOfBoundsException
	{
		int res[]={100};
		System.out.println("Result is "+res[1]);
	}
	void f2()
	{
		f1();
	}
	void f3()
	{
		f2();
	}
	public static void mian(String args [])
	{
		TestThrows ob=new TestThrows();
		try
		{
			ob.f3();
		}
		catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println("out of bound ");
		}
	}
}
