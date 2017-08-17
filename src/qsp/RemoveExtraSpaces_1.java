package qsp;

import java.util.Scanner;

public class RemoveExtraSpaces_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String words[]=str.split(" ");
		String str1="";
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()>0)
			{
				str1=str1+words[i]+" ";
			}
		}
		 
		System.out.println(str1);
	}

}
