package qsp;

import java.util.Scanner;

public class PrintCounting_1_to_100WithoutLoop {

	public static void main(String[] args) {
		count(15);
	}
	static void count(int i)
	{
		if(i==0)
			return;
		try
		{
			i--;
			count(i);
			System.out.print(i);
			
		}
		catch(ArithmeticException | IllegalStateException  e)
		{
			
		}
		finally
		{
			
			
		}
		
	}
}
