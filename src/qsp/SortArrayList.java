package qsp;

import java.util.ArrayList;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) 
	{
		String str[]={"Hello","Facebook","Facebook","Gmail","Youtube","Nama"};
		List<String> lst=new ArrayList();
		for(String st:str)
		{
			lst.add(st);
		}
		System.out.println(lst);
		String temp="";
	
		StringBuffer ss =	new StringBuffer("rev");
		System.out.println("-->");
		for(int i=0;i<lst.size();i++)
		{
			for(int j=i;j<lst.size();j++)
			{
				if(lst.get(i).compareTo(lst.get(j)) >0 )
				{
					temp=(String)lst.get(i);
					lst.set(i,lst.get(j));
					lst.set(j,temp);
				}
			}
		}
		System.out.println(lst);
	}
}
