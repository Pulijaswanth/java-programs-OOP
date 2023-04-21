//custom exception or User defined exception
import java.util.*;
class BalanceValidation extends Exception
{
	String str;
	BalanceValidation(String str)
	{
		this.str=str;
	}
	public String toString()
	{
		return str;
	}
}
class TestBalance
{
	static void ValidateBalance(int amount) throws BalanceValidation
	{
		int balance = 20000;
		if(amount <= balance)
		{
			int res = balance - amount;
			System.out.println("The balance amount is "+res);
		}
		else
		{
			throw new BalanceValidation("You do not have sufficient balance");
		}
	}
	public static void main(String args [])
	{
		int amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		amount=sc.nextInt();
		try
		{
			ValidateBalance(amount);
		}
		catch(BalanceValidation ob)
		{
			System.out.println(""+ob);
		}
	}
}