//hierarchial inheritance
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
class Third extends First
{
	int no3;
	void getvalue()
	{
		no3=30;
	}
	void show()
	{
		System.out.println("Base class no1= "+no1);
		System.out.println("Derived class no2= "+no3);
	}
}
class Hierarchial//driver class
{
public static void main(String[] args)
    {
	Second ob1=new Second();
     ob1.get();
     ob1.input();
     ob1.show();
    System.out.println("-----------------------------");
	Third ob2=new Third();
     ob2.get();
     ob2.getvalue();
     ob2.show();	 
   }
}
