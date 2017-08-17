package qsp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class SortAccordingToLengthOfWords {
	public static void main(String[] args) {
/*		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine(),str2="";
		str=str+"  ";
		int len=str.length(),i,j=0,max=1,k;	

	for(k=1;k<=max;k++)
		{
		for(i=0;i<len;i++)
		{
			j++;
			if(str.charAt(i)==' ' )
			{	
				j--;
				if(max<j)max=j;
				if(j==k)
					str2=str2+str.substring(i-j,i)+" ";
				j=0;
			}
			
		}
	}
	System.out.println(str2.trim().toString());
	
	*/
		/*
	// 2.--->
	String sentence="Tommorow is not Holiday There is mock";
		String words[]=sentence.split(" ");
		boolean flag=true;
		System.out.println(Arrays.toString(words));
		String temp="";
		while(flag)
		{
			flag=false;
			for(int i=0;i<words.length-1;i++)
			{
				if(words[i].length()>words[i+1].length())
				{
					temp=words[i];
					words[i]=words[i+1];
					words[i+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(words));*/
	}
}