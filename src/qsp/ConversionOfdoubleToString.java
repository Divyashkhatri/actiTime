package qsp;

import java.util.Scanner;

public class ConversionOfdoubleToString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double d=sc.nextDouble();
		String s=""+d;
		System.out.println(s);
		
		//2nd way
		Double dd=new Double(d);
		String ss=new String(dd.toString());
		System.out.println(ss);
	
	}

}
