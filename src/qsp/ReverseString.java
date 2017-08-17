package qsp;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) 
	{
		String str="'WelCome @ test Y@ntr@";
		int length=str.length();
		char[] ch1=new char[length];
		for(int i=0,j=length-1;i<length;i++)
		{
			char ch=str.charAt(i);
			if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
			{
				char temp=str.charAt(j);
				if((temp>=65 && temp<=90) || (temp>=97 && temp<=122))
				{
					ch1[i]=temp;
					j--;
				}
				else
				{
					while(!((temp>=65 && temp<=90) || (temp>=97 && temp<=122)))
					{
						temp=str.charAt(j);
						j--;
					}
					ch1[i]=temp;
				}

			}
			else
			{
				ch1[i]=ch;
			}
		}
		str="";
		for(int i=0;i<length;i++)
		{
			str=str+ch1[i];
		}
		System.out.println(str);

	}
}
