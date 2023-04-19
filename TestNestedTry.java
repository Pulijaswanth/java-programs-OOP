class TestNestedTry
{
	public static void main(String args[])
	{
		int no=20;
		System.out.println("Welcome");
		try//out try block
		{
			int res=no/0;
			System.out.println("result is "+res);
			try//inner try block
			{
				int arr[]={100};
				System.out.println("Result is "+arr[0]);
			}
			catch(ArithmeticException ob)//inner catch block
			{
				System.out.println("Cannot be divided by zero");
			}
		}
		catch(ArithmeticException ob)
		{
			System.out.println("the outer catch block is implemented");
		}
		catch(NullPointerException ob)//outer catch block
		{
		    System.out.println("the value cannot be null");	
		}
		System.out.println("good");
		System.out.println("bye");
	}
}