package qsp;

import java.util.Scanner;

public class CountSpacesInSentance {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str);
		int i,count = 0,j;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			count++;
		}
		
		System.out.println(count);
	}

}
