package qsp;

import java.util.ArrayList;
import java.util.Scanner;

public class ConversionObjectToPrimitive {

	public static void main(String[] args) {
		//1st way
		Object ob=new Object();
		ob=10;
		int i=(int) ob;
		System.out.println(i);

		//2nd way
//		Scanner sc=new Scanner(System.in);
		ArrayList<Float> a1=new ArrayList<Float>();
		a1.add(6f);
		a1.add((float) +345); 
		a1.add(111.211111111f);
		Object o[]=a1.toArray();
		
		int val[]=new int[o.length];
		for(int i1=0;i1<o.length;i1++)
		{
			val[i]= ((Integer)o[i1]).intValue();
		}
		
		//3rd way
		Integer i1=new Integer(i);
		System.out.println(i1.intValue());
		
		
	}

}
