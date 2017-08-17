package qsp;

import java.util.Scanner;

public class ConversionStringToInt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
	
		Integer i=new Integer(s);
		int num=i.intValue();
		System.out.println(num);
		//2nd way
		int num_1=Integer.parseInt(s);
		System.out.println(num_1);
		
		}
}
