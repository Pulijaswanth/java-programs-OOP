import java.util.*;
class ReverseOOP
{
	int num,rev=0,digit=0,temp=0;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		temp=num;
	}
	void calculate()
	{
		while(num!=0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(rev==temp)
		{
			System.out.println("the number is a palindrome");
		}
		else
		{
			System.out.println("the number is not a palindrome");
		}
	}
	void display()
	{
		System.out.println(""+rev);
	}
	public static void main(String[] args)
	{
		ReverseOOP ob1=new ReverseOOP();//creation of new object
		ob1.input();
		ob1.calculate();
		ob1.display();		
	}
}
