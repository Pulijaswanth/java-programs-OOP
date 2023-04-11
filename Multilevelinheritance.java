//multi-level inheritance
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
}
class Third extends Second
{
	int no3;
	void getvalue()
	{
		no3=30;
	}
	void show()
	{
		System.out.println("Base class no1= "+no1);
		System.out.println("Derived class no2= "+no2);
		System.out.println("Derived class no2= "+no3);
	}
}
class Multilevel//driver class
{
public static void main(String[] args)
    {
	Third ob=new Third();
	ob.get();
	ob.input();
	ob.getvalue();
	ob.show();
	
   }
}
