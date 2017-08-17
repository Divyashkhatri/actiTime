package qsp;
import java.util.Scanner;
public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(),i=2,temp=1;
		while(temp>0 && i<num){
			temp=num%i;
			i++;
			if(temp==0)
			{
				System.out.print("number is not prime");
				break;
			}
		}
		if(temp!=0)
			System.out.print("number is prime");
	}
}