package qsp;

import java.util.*;

public class SortInStringAndMakeUnique {

	public static void main(String[] args) {
		// 1st way using tree set where it  is sorted in ascending order
		String str[]={"Google","Facebook","Tesla","Yahoo","Yahoo", "Google","Facebook","Tesla","eCommerce","mcommerce"};
		Set set=new TreeSet(Arrays.asList(str));
		String str1[]=new String[set.size()];
		Iterator itr=set.iterator();
		int i=0;
		while(itr.hasNext())
		
			str1[i++]=(String) itr.next();
		System.out.println(Arrays.toString(str1));
		
		//2nd way
		Set set1=new HashSet(Arrays.asList(str));
		String str2[]=new String[set1.size()];
		Iterator itr2=set.iterator();
		i=0;
		while(itr2.hasNext())
		{
			str2[i++]=(String) itr2.next();
		}
		
		sortArray(str2,true);
		System.out.println(Arrays.toString(str2));
		sortArray(str2,false);
		System.out.println(Arrays.toString(str2));
		
		
		
	
	}

	static void sortArray(String []arr,Boolean ascending)
	{
		String temp="";
		Boolean flag=true;
		for(int i=0;i<arr.length-1;i++)
		{
		
			if(ascending)
			{
				if(arr[i].compareTo(arr[i+1])>0)
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag=true;
				}
			}
			else
			{
				if(arr[i].compareTo(arr[i+1])<0)
				{
					temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
					flag=false;
				}
			}
		}
	}
	
	
	
	
}
