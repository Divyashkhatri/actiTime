package qsp;
import java.util.Scanner;

public class FactorsOfANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				System.out.print(i+ " ");
			}
		}
	}

}
