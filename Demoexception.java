class Test
{
	public static void main(String args[])
	{
		int no=20;
		System.out.println("Welcome");
		try
		{
			int res=no/0;
			System.out.println("Result is "+res);
		}
		catch(ArithmeticException ob)
		{
			System.out.println("Cannot be divided by zero");
		}
		System.out.println("Good");
		System.out.println("Bye");
	}
}