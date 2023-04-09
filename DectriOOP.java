import java.util.*;
class DectriOOP
{
	int num,i,j;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of star");
		num=sc.nextInt();
	}
	void display()
	{
	{
		for(i=0;i<=num;i++)
		{
			for(j=0;j<=i;j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
	}	
	}
	public static void main(String[] args)
	{
		DectriOOP ob1=new DectriOOP();
		ob1.input();
		ob1.display();
	}
}
