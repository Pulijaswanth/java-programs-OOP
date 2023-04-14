//parameterised constructor and inheritance 
class First
{
	int num1;
	First()
	{
		System.out.println("Base class ");
	}
	First(int number)
	{
		num1=number;
		System.out.println("Base class value is "+num1);
	}
}
class Second extends First
{
	int num2;
	Second()
	{
		System.out.println("Derived class");
	}
	Second(int value1,int value2)
	{
		super(value2);
		num2=value1;
		System.out.println("Derived class value is "+num2);
	}
}
class DemoConstructorParametersuper
{
	public static void main(String[] args)
	{
		Second ob1=new Second();
		Second ob=new Second(10,20);
	}
}