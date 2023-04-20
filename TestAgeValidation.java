//custom exception or User defined exception
import java.util.*;
class AgeValidation extends Exception
{
	String str;
	AgeValidation(String str)
	{
		this.str=str;
	}
	public String toString()
	{
		return str;
	}
}
class TestAgeValidation
{
	static void ValidateAge(int age) throws AgeValidation
	{
		if(age>=18)
		{
			System.out.println("Welcome to vote");
		}
		else
		{
			throw new AgeValidation("not allowed");
		}
	}
	public static void main(String args [])
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		age=sc.nextInt();
		try
		{
			ValidateAge(age);
		}
		catch(AgeValidation ob)
		{
			System.out.println("as age is less than 18 so "+ob);
		}
	}
}