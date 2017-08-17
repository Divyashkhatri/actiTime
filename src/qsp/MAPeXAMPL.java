package qsp;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MAPeXAMPL {
		/*
		 * write a program to find number of repeated character in a given matrix
		 * String matrix[][]==>
		 * A B C 
		 * D A B 
		 * A B E
		 * so output is 2 because A B are repeated
		 */
	public static void main(String[] args) {
		String str[][]={{"w","e","z"},{"w","e","r"},{"w","e","r"}};
		int count=0;
		Map<Character,Integer> map=new LinkedHashMap();		
		String temp1="";
		for(int i=0;i<str.length;i++)
		{

			for(int j=0;j<str[i].length;j++)
			{
				temp1=temp1+str[i][j];
			}
		}
		char ch[]=temp1.toCharArray();
		int temp=0;
		for(int i=0;i<ch.length;i++)
		{
			if(!map.containsKey(ch[i]))
				map.put(ch[i],1);
			else
			{	
				temp=map.get(ch[i]).intValue();
				temp++;
				map.put(ch[i],temp);
			}
		}







				Set<Character> keys =map.keySet();
				for(Character key:keys)
				{
					if(map.get(key).intValue()>1)
						count++;
				}
				System.out.println(count);
}

}
