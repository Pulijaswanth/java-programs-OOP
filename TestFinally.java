//use of finally block
class TestFinally
{
	public static void main(String args [])
	{
		System.out.println("Welcome");
		try
		{
			int res[]={100};
			System.out.println("Result is "+res[1]);
		}
		catch(IndexOutOfBoundsException ob)
		{
			System.out.println("index out of bound ");
		}
		finally
		{
			System.out.println("Fianlly bock is executed");
		}
	}
	
}