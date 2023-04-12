import java.util.*;
class shape
{
	float side1,side2,side3;
	void input()
	{
		System.out.println("Base class input");
	}
	void area()
	{
		System.out.println("Base class area method");
	}
	void show()
	{
		System.out.println("Base class show method");
	}
}
class Square extends shape
{
	float res;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side of the square");
		side1=sc.nextFloat();
	}
	void area()
	{
		res=side1*side1;
	}
	void show()
	{
		System.out.println("Area of the square is "+res);
	}
} 
class Triangle extends shape
{
	float s;
	double res;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sides of the Triangle");
		side1=sc.nextFloat();
		side2=sc.nextFloat();
		side3=sc.nextFloat();
	}
	void area()
	{
		s=(side1+side2+side3)/2;
		res=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	void show()
	{
		System.out.println("Area of the triangle is "+res);
	}
} 
class Rectangle extends shape
{
	float res,s;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sides of the Rectangle");
		side1=sc.nextFloat();
		side2=sc.nextFloat();
	}
	void area()
	{ 
	      
		res=side1*side2;
	}
	void show()
	{
		System.out.println("Area of the rectangle is "+res);
	}
} 
class Polymorphism
{
	public static void main(String[] args)
	{
		shape ob;
		ob=new shape();
		System.out.println("shape class details");
		System.out.println("-----------------------");
		ob.input();
		ob.area();
		ob.show();
		System.out.println("--------------------");
		ob=new Square();
		ob.input();
		ob.area();
		System.out.println("--------------------");
		ob.show();
		System.out.println("--------------------");
		ob=new Triangle();
		ob.input();
		ob.area();
		System.out.println("--------------------");
		ob.show();
		System.out.println("--------------------");
		ob=new Rectangle();
		ob.input();
		ob.area();
		System.out.println("--------------------");
		ob.show();
		
	}
}
