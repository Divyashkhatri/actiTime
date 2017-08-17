package qsp;

interface AA
{
	void print();
}

interface BB
{
	
	void print();
//	int print();
}

class CC implements AA,BB
{
	public void print()
	{
		System.out.println("print in c");
	}
	
//	public int print()
//	{	//here overloading and overriding both is happening
//		System.out.println("print in c");
//	}
}


public class InterfaceInstance 
{
	public static void main(String[] args) 
	{		
		CC c=new CC();
		AA a=new CC();
		BB b=new CC();
		a.print();
		b.print();
		c.print();
		System.out.println("finished");
	}

}

