package qsp;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[]=new int[100];
	int i;
	for (i=0;i<100;i++){
		arr[i]=i+1;
	}
	int len=arr.length/2,temp,len2=arr.length-1;
	
	for(i=0;i<len;i++){
		temp=arr[len2-i];
		arr[len2-i]=arr[i];
		arr[i]=temp;	
	}
	for(i=0;i<100;i++)
		System.out.print(arr[i]+" ");
	
	
	}

}
