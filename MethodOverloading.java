//method overloading 
class MethodOverloading
{
	int add(int no1,int no2)
	{
		return no1+no2;
	}
	int add(int no1,int no2,int no3)
	{
		return no1+no2+no3;
	}
	float add(float no1,float no2)
	{
		return no1+no2;
	}
	float add(float no1,float no2,float no3)
	{
		return no1+no2+no3;
	}
	public static void main(String[] args)
	{
		MethodOverloading ob1=new MethodOverloading();
		System.out.println("Sum is "+ob1.add(10,25));
		System.out.println("sum is "+ob1.add(20,35,50));
		System.out.println("sum is "+ob1.add(10.25f,25.75f));
		System.out.println("sum is "+ob1.add(15.25f,14.27f,13.20f));
	}
}