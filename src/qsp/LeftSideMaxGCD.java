package qsp;

import java.util.Scanner;

public class LeftSideMaxGCD {

	static int gcd(int x, int y)
    {
        int r=0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
 
        r = b;
        while(a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
 
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
				int size=s.nextInt();
				int a[]=new int[size];
				int arr[]=new int[size];
				
				for(int i=0;i<size;i++)
				{
					a[i]=(int) s.nextInt();
					System.out.println(a[i]);
					arr[i]=0;
				}
				arr[0]=-1;int num=0;
				for(int i=size-1;i>=0;i--)
				{
					for(int j=i;j>=0;j--)
					{
						num=LeftSideMaxGCD.gcd(a[i], a[j]);
						System.out.print(num+" ");
						if(arr[i]<num)
						{
							
						}
					}
				}
			
				
				
				
				
				
			
		}
	}

}
