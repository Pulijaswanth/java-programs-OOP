//error will be displayed as the output of this program 
//the error will be about the override method
import java.util.*;
class First
{
	final void show()
	{
		System.out.println("Base class method");
	}
}
class Second extends First
{
	void show()
	{
		System.out.println("Derived class method");//not allowed as final base
	}
} 
class DemoFinalMethod
{
	public static void main(String[] args)
	{
		Second ob=new Second();
		ob.show();
		ob.show();
	}
}

