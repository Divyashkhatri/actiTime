package qsp;
/*
  A
 *B*
**C**
 *D*
  E
*/
/*
0 --> 48
9 --> 57
A --> 65
Z --> 90
a --> 97
z --> 122
*/
public class PatternPrinting {

	public static void main(String[] args) {
	
/*	System.out.println('z'+1);
	System.out.println(""+'z'+1);
	char s='A';
			switch(s)
			{
				case 'A': System.out.println("Hello");
				break;
				case 'h': System.out.println("Hello");
				break;
				case 'B':System.out.println("ram");
				break;
				default :System.out.println("ra");
				break;
			}
*/
		int count=0;
		for(int i=0,k=4;i<4;i++,k--)
		{
			for(int j=3-i;j>=0;j--)
				System.out.print(" ");
				
			for(int j=0;j<=i;j++)
			{
				System.out.print(++count+" ");
			}
		System.out.println();
		}
	
	}
}
