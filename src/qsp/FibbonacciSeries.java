package qsp;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int a=0,b=1,temp=0;
		while(num>0)
		{	
			temp=a;
			a=a+b;
			b=temp;
			System.out.print(b+" ");
			num--;
		}
		
	}

}
