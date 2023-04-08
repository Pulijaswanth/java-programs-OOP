import java.util.*;
class MaxminOOP
{
	int arr[]=new int[20];
	int size,index,max,min;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		size=sc.nextInt();
	for(index=0;index<size;index++)
	{
		System.out.println("enter the elements into the array");
		arr[index]=sc.nextInt();
	}		
	}
	void calculate()
	{
       max=arr[0];
	   for(index=0;index<size;index++)
	   {
		   if(arr[index]>max)
		   {
			   max=arr[index];
		   }
	   }
	   min=arr[0];
	   for(index=0;index<size;index++)
	   {
		   if(arr[index]<min)
		   {
			   min=arr[index];
		   }
	   }
	}
	void show()
	{
		System.out.println("the elements in the array are ");
		for(index=0;index<size;index++)
		{
			System.out.print(" "+arr[index]);
		}
		System.out.println();
		System.out.println("The maximum value is "+max);
		System.out.println("The minimum value is "+min);
	}
	public static void main(String[] args)
	{
		MaxminOOP ob1=new MaxminOOP();
		ob1.input();
		ob1.calculate();
		ob1.show();
	}
}
