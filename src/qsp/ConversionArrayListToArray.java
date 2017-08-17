package qsp;

import java.util.ArrayList;

public class ConversionArrayListToArray {

	public static void main(String[] args) {
		//How do you convert an arraylist to an array ?
		ArrayList<Float> a=new ArrayList<Float>();
		a.add(6f);
		a.add((float) +345); 
		a.add(111.211111111f);//till five digit
		Float f[]=new Float[a.size()];
		for(int i=0;i<a.size();i++)
		{
			f[i]=a.get(i);
			System.out.println(f[i]);
		}
		// 2nd method
		// we can use toarray() method to convert array list to array and it returns object array
		ArrayList<Float> a1=new ArrayList<Float>();
		a1.add(6f);
		a1.add((float) +345); 
		a1.add(111.211111111f);
		Object o[]=a1.toArray();
		for(Object ob:o)
		System.out.println(ob);
		
		//conversion of objectarraylist to to int array
		
		
		
		
		
		}

}
