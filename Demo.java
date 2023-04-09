//command line argument
class demo
{
	public static void main(String args[])
	{
		int no1,no2,res;
		no1=Integer.parseInt(args[0]);
		no2=Integer.parseInt(args[1]);
		res=no1+no2;
		System.out.println("Sum is "+res);
	}
}