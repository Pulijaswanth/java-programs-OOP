//Demo datatype
class Datatype
{
	byte no;
	short sno;
	int ino;
	boolean bno;
	char ch;
	float fno;
	public static void main(String args [])
	{
		Datatype ob=new Datatype();
		System.out.println("Default value of byte is "+ob.no);
		System.out.println("Default value of short is "+ob.sno);
		System.out.println("Default value of int is "+ob.ino);
		System.out.println("Default value of boolean is "+ob.bno);
		System.out.println("Default value of char is "+ob.ch);
		System.out.println("Default value of float is "+ob.fno);
	}
}