//types of variable
class TestVariable
{
	int no=10;//Instance variable or non static variable
	static int num=40;//static variable
	void input()
	{
		no++;
		num++;
	}
	void show()
	{
		int value=50;//local variable
		System.out.println(no);
		System.out.println(num);
		System.out.println(value);
	}
	public static void main(String[] args)
	{
		int value=20;//local variable
		TestVariable ob1=new TestVariable();
		ob1.input();
		System.out.println("values of object 1");
		ob1.show();
		TestVariable ob2=new TestVariable();
		ob2.input();
		System.out.println("values of the object 2");
		ob2.show();
		System.out.println("inside the main value ="+value);
	}
	
}