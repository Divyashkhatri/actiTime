package qsp;

import java.util.Scanner;
public class SortLexically {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str+" ";
		int len=str.length(),i,j=0,count=0;
		for(i=0; i<len; i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
	String str1[]=new String[count];
	for(j=0;j<count;j++)
	str1[j]="";
	for(i=0,j=0;i<len;i++)
	{	
		if(str.charAt(i)==' ')
		{
			j++;
		}
		else
			str1[j]=str1[j]+str.charAt(i);
	}

	int minlen=20,index=0;
	String tempstr;
	for(i=0;i<count;i++)
	{
		for(j=i+1;j<count;j++)
		{
			if(str1[i].compareTo(str1[j])>0)
			{
				tempstr=str1[i];
				str1[i]=str1[j];
				str1[j]=tempstr;
			}		
		}
	}
	for(i=0;i<count;i++){
	System.out.println(str1[i]);
	}
	}
}