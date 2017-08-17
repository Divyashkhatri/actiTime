package qsp;
public class PrimeNumber {
	public static void main(String[] args) {
		int arr[] =new int[1000];
		int j,i;
		 for( j=1;j<1001;j++)
			 arr[j-1]=j;
		 
		 for( i=2;i<1000;i++)
		 {
			 for(j=i+1;j<1000;j++)
			 {
				 if(arr[j]%i==0)
					 arr[j]=0;
			 }
		 }
	for(i=1;i<1000;i++)
		if(arr[i]!=0)
			System.out.print(arr[i]+" ");
	}
}
