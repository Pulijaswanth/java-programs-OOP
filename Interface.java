import java.util.*;
 interface ShapeInterface
{
	 void input();
	 void area();
	public abstract void show();
}
class SquareInterface implements ShapeInterface
{
	float res;
	float side1;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side of the square");
		side1=sc.nextFloat();
	}
	public void area()
	{
		res=side1*side1;
	}
	public void show()
	{
		System.out.println("Area of the square is "+res);
	}
} 
class TriangleInterface implements ShapeInterface
{
	float s;
	double res;
	float side1,side2,side3;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sides of the Triangle");
		side1=sc.nextFloat();
		side2=sc.nextFloat();
		side3=sc.nextFloat();
	}
	public void area()
	{
		s=(side1+side2+side3)/2;
		res=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	public void show()
	{
		System.out.println("Area of the triangle is "+res);
	}
} 
class RectangleInterface implements ShapeInterface
{
	float res;
	float side1,side2;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sides of the Rectangle");
		side1=sc.nextFloat();
		side2=sc.nextFloat();
	}
	public void area()
	{ 
	      
		res=side1*side2;
	}
	public void show()
	{
		System.out.println("Area of the rectangle is "+res);
	}
} 
class InterfaceShape
{
	public static void main(String[] args)
	{
		ShapeInterface ob;
		ob=new SquareInterface();
		ob.input();
		ob.area();
		System.out.println("--------------------");
		ob.show();
		System.out.println("--------------------");
		ob=new TriangleInterface();
		ob.input();
		ob.area();
		System.out.println("--------------------");
		ob.show();
		System.out.println("--------------------");
		ob=new RectangleInterface();
		ob.input();
		ob.area();
		System.out.println("--------------------");
		ob.show();
		
	}
}
