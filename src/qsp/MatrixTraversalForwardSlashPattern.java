package qsp;

	//	0	1	2	3	4
	//0	00	01	02	03	04
	//1	10	11	12	13	14
	//2	20	21	22	23	24
	//3	30	31	32	33	34
	//4	40	41	42	43	44
	//5	50	51	52	53	54
	//
	//00
	//01	10
	//02	11	20
	//03	12	21	30
	//04	13	22	31	40
	//
	//14	23	32	41	50
	//24	33	42	51
	//34	43	52
	//44	53
	//54
public class MatrixTraversalForwardSlashPattern {

	public static void main(String[] args) {
	MatrixTraversalForwardSlashPattern.traversal(2,5);	
	}
	
	
	public static void traversal(int row,int col){
		
		if(row==col)
		{
			for(int i=0;i<col;i++)
			{
				for(int j=0,k=i;j<=i;j++,k--)
				{
					System.out.print(j+""+k+" ");
				}
				System.out.println();
			}
			
			
			for(int i=0;i<row-1;i++)
				{
					for(int k=col-1,j=i+1;k>i & j<=col-1;k--,j++)
					{
						System.out.print(j+""+k+" ");
					}
					System.out.println();
				}	
		}
		else if(row > col)
		{
			
		}
		else 
		{
			for(int i=0;i<col;i++)
			{
				for(int j=0,k=i;j<=i ;j++,k--)
				{
					System.out.print(j+""+k+" ");
				}
				System.out.println();
			}
			
		}
		
	}
	
	
	
	
}


