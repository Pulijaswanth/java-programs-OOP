import java.util.*;
class Studentcall
{
	String name;
	int roll;
	float mark;
	Studentcall()//default constructor
	{
		name="Jaswanth";
		roll=12;
		mark=98.9f;
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		name=sc.next();
		System.out.println("Enter the roll");
		roll=sc.nextInt();
		System.out.println("enter the marks");
		mark=sc.nextFloat();
	}
	void display()
	{
		System.out.println("Name ="+name);
		System.out.println("Roll num="+roll);
		System.out.println("marks="+mark);
	}
	public static void main(String[] args)
	{
		Studentcall st1=new Studentcall();//creation of object
		System.out.println("details of the first student");
		st1.display();
		Studentcall st2=new Studentcall();
		st2.input();
		st2.display();
	}
}
