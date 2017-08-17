package qsp;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows in matrix-->");
		int rows=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Column in matrix-->");
		int col=sc.nextInt();
		sc.nextLine();
			int a[][]=new int[rows][col];
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<col;j++)
				{
				
				a[i][j]=sc.nextInt();
				sc.nextLine();
				}
			}
			for(int i=0;i<rows;i++)
			{
				System.out.println(">");
				for(int j=0;j<col;j++)
				{
					
					System.out.print(a[i][j]+" ");
				}
				
			}
			int[][] tra=new int[col][rows];
			//Integer i1[][]=new Integer[2][2];
			for(int i=0;i<col;i++)
			{
				System.out.println(">");
				for(int j=0;j<rows;j++)
				{
					tra[i][j]=a[j][i];
					System.out.print(a[j][i]);
				}
				
			}
			
			
	}

}
