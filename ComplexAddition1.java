//constructor with parameter....
import java.util.*;
class ComplexAddition1
{
	int real,img;
	ComplexAddition1()
	{
		
	}
	ComplexAddition1(int real1,int img1)
	{
		real=real1;
		img=img1;
	}
	void add(ComplexAddition1 ob1,ComplexAddition1 ob2)
	{
		real=ob1.real+ob2.real;
		img=ob1.img+ob2.img;
	}
	void display()
	{
		System.out.println("sum is"+real+"+i"+img);
	}
	public static void main(String[] args)
	{
		int real,img;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the real value");
		real=sc.nextInt();
		System.out.println("enter the imaginary value");
		img=sc.nextInt();
		ComplexAddition1 ob1=new ComplexAddition1(real,img);
		System.out.println("second object input");
		System.out.println("enter the real value");
		real=sc.nextInt();
		System.out.println("enter the imaginary value");
		img=sc.nextInt();
		ComplexAddition1 ob2=new ComplexAddition1(real,img);//creation of new object
		ComplexAddition1 ob3=new ComplexAddition1();//creation of new object		
		ob3.add(ob1,ob2);
		ob3.display();
	}
}