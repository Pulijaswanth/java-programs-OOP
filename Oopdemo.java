//demo on  OOP
import java.util.*;
class Student
{
	String name;
	int roll;
	float mark;
	void input()
	{
	   Scanner sc=new Scanner(System.in);
		System.out.println("Enter name ");
		name=sc.next();
		System.out.println("enter the roll number");
		roll=sc.nextInt();
		System.out.println("Enter the marks");
		mark=sc.nextInt();
	}
	void display()
	{
		System.out.println("Name ="+name);
		System.out.println("roll number="+roll);
		System.out.println("marks ="+mark);
	}
	public static void main(String[] args)
	{
		Student st1=new Student();//object creation of class
		st1.input();
		System.out.println("detils of the first student");
		System.out.println("-----------------------------");
		st1.display();
		Student st2=new Student();
		st2.input();
		System.out.println("Details of the second student");
		System.out.println("--------------------------------");
		st2.display();
}
}
