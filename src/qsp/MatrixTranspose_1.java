package qsp;

import java.util.Arrays;

public class MatrixTranspose_1 {
	// This program will work only when rows and column are  equal
	public static void main(String[] args) {
		int temp=0;
	//	int arr[][]=new int[3][3];
	//	arr[][]={{10,20,30},{40,50,60},{70,80,90}};
		int arr[][]={{10,20,30},{40,50,60},{70,80,90}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<i;j++)
			{
				temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		//System.out.println(Arrays.toString(arr));

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
