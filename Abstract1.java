import java.util.*;
 abstract class shapeAbstract
{
	float side1,side2,side3;
	abstract void input();
	abstract void area();
	abstract void show();
}
class SquareAbstract extends shapeAbstract
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
class TriangleAbstract extends shapeAbstract
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
class RectangleAbstract extends shapeAbstract
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
class Abstract
{
	public static void main(String[] args)
	{
		shapeAbstract ob;
		ob=new SquareAbstract();
		ob.input();
		ob.area();
		System.out.println("--------------------");
		ob.show();
		System.out.println("--------------------");
		ob=new TriangleAbstract();
		ob.input();
		ob.area();
		System.out.println("--------------------");
		ob.show();
		System.out.println("--------------------");
		ob=new RectangleAbstract();
		ob.input();
		ob.area();
		System.out.println("--------------------");
		ob.show();
		
	}
}
