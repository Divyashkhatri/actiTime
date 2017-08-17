package qsp;

import java.util.Scanner;

public class ConversionPrimitiveToObject {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double d=sc.nextDouble();
		Object ob =d;
		System.out.println(ob);
		System.out.println(ob.getClass());
		
		//2nd way
		//by passing primitive variable to wrapper class constructor
		Double d1=new Double(d);
		System.out.println(d1);
		

	}

}
