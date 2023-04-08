//Demo on this keyword
import java.util.*;
class Student1
{
	String name;
	int roll;
	float mark;
	Student1()//default constructor
	{
		name="Dheeraj";
		roll=12;
		mark=98.9f;
	}
	Student1(String name,int roll,float mark)
	{
		this.name=name;
		this.roll=roll;
		this.mark=mark;
	}
	void display()
	{
		System.out.println("Name ="+name);
		System.out.println("Roll num="+roll);
		System.out.println("marks="+mark);
	}
	public static void main(String[] args)
	{
		Student1 st1=new Student1();//creation of object
		System.out.println("details of the first student");
		st1.display();
		System.out.println("-------------------------------");
		Student1 st2=new Student1("Jaswanth",123,98.6f);
		st2.display();
		System.out.println("--------------------------------");
		Student1 st3=new Student1("vihar",124,55.8f);
		st3.display();
	}
}
