package qsp;

public class FibbonacciSeriesUsingRecursion {

	public static void main(String[] args) 
	{
		fibbonaciSeries(30);
		
	}
	static int a=0,b=1;
		static public void fibbonaciSeries(int num) 
		{
			int c;
			if(num<2)
			{
				
				a=0;b=1;
			}
			else
			{
				fibbonaciSeries(num-1);
				c=b;
				b=a+b;
				a=c;
			}
			System.out.print(a+" ");
		}
}
