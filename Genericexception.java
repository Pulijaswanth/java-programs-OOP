class GenericException
{
	public static void main(String args[])
	{
		int no=20;
		System.out.println("Welcome");
		try
		{
			int res[]={100};
			System.out.println("Result is "+res[1]);
		}
		catch(NullPointerException ob)
		{
			System.out.println("Null value is stored");
			
		}
		catch(ArithmeticException ob)
		{
			System.out.println("Cannot be divided by zero");
			
		}
		catch(Exception ob)
		{
			System.out.println("Generic exception");
			
		}
	
		System.out.println("Good");
		System.out.println("Bye");
		
	}
}

//The generic exception catch block must be placed at the end of the program because it catches the value only when after all the catch blocks are tried orelse if the catch block of the generic exception is placed then it will show as error while compiling the program