package qsp;

import java.util.Scanner;

public class IdentifyInputStringOrNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		try{
		Integer.parseInt(str);
		System.out.println("Input is Number");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Input is String");
			
		}
		System.out.println("What is you plan today");
	}

}
