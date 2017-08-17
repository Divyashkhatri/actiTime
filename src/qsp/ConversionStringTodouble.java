package qsp;

import java.util.Scanner;

public class ConversionStringTodouble {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		Double d=new Double(s);
		System.out.println(d);//works
		System.out.println(d.toString());//works
		double d1=d.doubleValue();
		System.out.println(d1);//works
	}

}
