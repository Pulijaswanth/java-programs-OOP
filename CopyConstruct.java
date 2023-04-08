import java.util.*;
class StudentCopy
{
	String name;
	int roll;
	float mark;
	StudentCopy()//default constructor
	{
		name="Dheeraj";
		roll=12;
		mark=98.9f;
	}
	StudentCopy(String name,int roll,float mark)
	{
		this.name=name;
		this.roll=roll;
		this.mark=mark;
	}
	StudentCopy(StudentCopy ob)//copy constructor
	{
		name=ob.name;
	    roll=ob.roll;
		mark=ob.mark;
	}
	void display()
	{
		System.out.println("Name ="+name);
		System.out.println("Roll num="+roll);
		System.out.println("marks="+mark);
	}
	public static void main(String[] args)
	{
		StudentCopy st1=new StudentCopy();//creation of object
		System.out.println("details of the first student");
		st1.display();
		System.out.println("-------------------------------");
		StudentCopy st2=new StudentCopy("Jaswanth",123,98.6f);
		st2.display();
		StudentCopy st3=new StudentCopy(st2);//object creation of class
		System.out.println("Details of the third student");
		System.out.println("-------------------------------");
		st3.display();
	}
}
