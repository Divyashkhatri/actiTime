package qsp;

import java.util.Scanner;

public class ConversionIntToString {
	public static void main(String a[]){
		Scanner sc=new Scanner(System.in);
		float f=01.1f;
		int num=sc.nextInt();
		//1st way
		String s=new String();
		s=num+"";
		System.out.println(s);
		
		//2nd way
		Integer i=new Integer(num);
		String ss = i.toString();
		System.out.println(ss);
		
		//3rd way
		String s3=Integer.toString(num); String s3_1=Float.toString(f);
		System.out.println(s3_1);
		System.out.println(s3);

	}
}
