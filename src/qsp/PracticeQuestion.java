package qsp;

import java.util.Arrays;

public class PracticeQuestion {

	public static void main(String[] args) {
		//replace W with @ and T with # and A with !
		char ch[]={'W','T','A'};
		char ch1[]={'@','#','!'};
	String str=	PracticeQuestion.swapAlphabets("WELCOME TO TEST YANTRA.",ch,ch1);
	System.out.println(str);
	StringBuffer str1=new StringBuffer(str);
	reverseOnlyAlphabets(str1);
	
	}
	
	
	
	
	
	// write a program to add Symbol next to any alphabet
	public static void reverseOnlyAlphabets(StringBuffer str)
	{	
		int len=str.length();
		char[] arr=new char[str.length()];
		String chstr="";
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)>64 && str.charAt(i)<91 || str.charAt(i)>96 && str.charAt(i)<123)
			{
				chstr=chstr+str.charAt(i);
			}
		}
		System.out.println(chstr);
		for(int i=0,j=chstr.length()-1;i<len;i++)
		{    arr[i]='0';
			if(!(str.charAt(i)>64 && str.charAt(i)<91 || str.charAt(i)>96 && str.charAt(i)<123))
				{
					
					arr[i]=str.charAt(i);
					System.out.print(arr[i]);
				}
			else 
			{
				arr[i]=chstr.charAt(j);
				j--;
				System.out.print(arr[i]);
			}
		}	
	
		
	}
	
	
	
	
	public static String swapAlphabets(String str,char ch[],char replacable_char[]) {
		
		String str1="";
		for(int j=0;j<ch.length;j++)
		{
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)==ch[j])
					str1=str1+str.charAt(i)+replacable_char[j];
				else 
					str1=str1+str.charAt(i);
			}
			str=str1;
			str1="";
		}
		return str;
	}

}
