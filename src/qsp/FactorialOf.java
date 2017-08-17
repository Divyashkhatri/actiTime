package qsp;
import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOf {

/*
 *find factorial without recursion
 * 	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the factorial number ");
		int num=sc.nextInt();
		 long temp=1;
		 while(num>0)
		 {
			temp=temp*num;
			num--;
		 }
		System.out.println(temp+" ");
	}
*/
	public static void main(String[] args) {
		
		System.out.println(fact(new BigInteger("1")));
	
	BigInteger bb=new BigInteger("1234567843212345788765432357123456765432123568875432357887543234678987654323568998754323457");
//	System.out.println(bb);
	BigInteger bb1=new BigInteger("1234567843212345788765432357123456765432123568875432357887543234678987654323568998754323457");
//	System.out.println(bb1==bb);
//	System.out.println(bb1.equals(bb));
//		System.out.println(bb.subtract(bb1));
//		System.out.println(bb);
	
	}
	static	BigInteger fuc=new BigInteger("1");
	public static BigInteger fact(BigInteger n)
	{
		if(n.equals(new BigInteger("1")))
		{
			return fuc;
		}
		else
		{
			fuc = n.multiply(fact(n.subtract(new BigInteger("1"))));
			return fuc;
		}
	}
	
	
	
}
