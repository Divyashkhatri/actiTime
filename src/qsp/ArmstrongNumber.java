package qsp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
 *ArmStrong Number
 *power= number of digits
 * sum of power of digit is equal to the given number then it is armstrong number.
 * 143 = 1(cube)+ 4 (cube) +3 (cube)
 *  54 = 5(square)+4(square)
 *   8 = 8(power 1)
 */
public class ArmstrongNumber {
	public static void main(String[] args) 
	{	
		for(int i=0;i<10000;i++)
			new ArmstrongNumber().armStrongNumber(i);
	}
	boolean armStrongNumber(int num)
	{
		List<Integer> l1=digitOfNumber(num);
		int size=l1.size();
		int result=0;
		
		for(int i=0;i<size;i++)
		{
			int val=(int)Math.pow(l1.get(i),size);
			result=result+val;	   
		}
		if(result==num)
		{
			System.out.println(num);
			return true;
		}
		else 
			return false;
	}
	
	ArrayList<Integer> digitOfNumber(int num)
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
