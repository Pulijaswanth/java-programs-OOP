//multilevel inheritance example  question
import java.util.*;
class First
{
	int no1;
void get1()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number1 ");
	no1=sc.nextInt();
}
}	
class Second extends First
{
	int no2;
void get2()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number2");
	no2=sc.nextInt();
}
}
class Third extends Second 
{
	int no3,smallest;
void get3()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number3 ");
	no3=sc.nextInt();
}
void findsmall()
{
	if(no1<no2)
	{
		if(no1<no3)
		{
			smallest=no1;
		}
	}
	else if(no2<no1)
	{
		if(no2<no3)
		{
			smallest=no2;
		}
	}
	else if(no3<no1)
	{
		if(no3<no2)
		{
			smallest=no3;
		}
	}
}
	void show()
	{
		System.out.println("the smallest number is "+smallest);
	}
}
class Multiexample
{
	public static void main(String[] args)
	{
		Third ob1=new Third();
		ob1.get1();
		ob1.get2();
		ob1.get3();
		ob1.findsmall();
		ob1.show();
	}
}		
