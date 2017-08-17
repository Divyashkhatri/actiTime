package qsp;

public class AdditionOfTwoNumber {

	static int add1(int x, int y)
	{
		if(y==0)
		{
			return x;
		}

		return add1( x^y , (x&y) << 1 );
	}
	public static void main(String[] args)
	{

		System.out.println(add1(1111,11));

	}
}
