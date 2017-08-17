package qsp;

import java.util.ArrayList;
import java.util.List;

public class ReverseNumber {

	public static void main(String[] args) {

		ArrayList l1=new ReverseNumber().reverseNumber(100701);
		for(int i=0;i<l1.size();i++)
		System.out.print(l1.get(i));
	}
	
	
	
	ArrayList<Integer> reverseNumber(int num)
	{
		ArrayList<Integer> l1=new ArrayList<Integer>();
		int num1=num;
		int x=0;
		while(num1>0)
		{
			x=num1%10;
			l1.add(new Integer(x));
			num1=num1/10;
		}
	return l1;
	}
	

}
