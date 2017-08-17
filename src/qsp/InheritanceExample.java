package qsp;

class A
{
	int i=100;
	static int j=102;
	private int k=202;
	void print()
	{
		System.out.println("i="+i);
		
	}
	static void disp()
	{
		System.out.println("j="+j);
	}
	
}
class B extends A
{
	
	
}
public class InheritanceExample extends B{

	public static void main(String[] args) {
		B b1=new B();
		System.out.println(b1.i+" "+b1.j);
		b1.print();
		B.disp();

	}

}
