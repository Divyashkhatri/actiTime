package qsp;

import java.util.Arrays;

public class NthLargestNumber {
	static int test(int a[],int n)
	{	int temp=0,len=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<len-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a[len-n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,20,0,40,1,7,6,8,5};
	System.out.println(	test(a,1));
		

	}

}
