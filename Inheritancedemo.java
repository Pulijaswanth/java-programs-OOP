//Inheritance example

class First//base class
{
	int no1;
	void get()
	{
		no1=10;
	}
}
class Second extends First//derived class
{
	int no2;
	void input()
	{
		no2=20;
	}
	void show()
	{
		System.out.println("Base class no1= "+no1);
		System.out.println("Derived class no2= "+no2);
	}
}
class Inheritancedemo//driver class
{
public static void main(String[] args)
    {
	Second ob=new Second();
	ob.get();
	ob.input();
	ob.show();
	
   }
}

