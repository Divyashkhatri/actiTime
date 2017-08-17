package qsp;
import java.util.Arrays;
import java.util.Scanner;
public class WallAndBombProblem {
//one bomb break two walls both side then how many walls broken...
/*
 * input number of testcases(T) and String in the form of 'B' and 'W'
 * output is number of walls broken
  *******************
4
BWBWBWBBBWWBB
WWBWBWWBW
WWWWBBWWBWWBWBWB
BWWWWWB
WBW
WWWWWWWBWWWWW
 */
	public static void main(String[] args) {
		
	       Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	      sc.nextLine();
	    while(T-->=0)
	    {
	    	int count=0;
	        String str=sc.nextLine();
	        int len=str.length();
	        char ch[]=str.toCharArray();
	        for(int i=0;i<len;i++)
	        {	        
	        	if(i>1 && i<len-2 && ch[i]=='B')
	        	{
	        		
	        		if(ch[i-1]=='W')
	        		{	ch[i-1]='D';    count++;}
	        		
	        		if(ch[i-2]=='W')
	        		{	ch[i-2]='D';    count++;}
	        		
	        		if(ch[i+1]=='W')
	        		{	ch[i+1]='D';    count++;}
		        		
		        	if(ch[i+2]=='W')
		        	{	ch[i+2]='D';    count++;}
		        	continue;
	        	}
	        	if(i==0 && ch[0]=='B')
	        	{
	        		
	        		//if(len>1)
	        		if(ch[i+1]=='W')
		        	{	ch[i+1]='D';    count++;}
	        		//if(len>2)
	        		if(ch[i+2]=='W')
		        	{	ch[i+2]='D';    count++;}
	        		
	        	}
	        	if(i==1 && ch[1]=='B')
	        	{
	        		
	        		if(ch[i-1]=='W')
		        	{	ch[i-1]='D';    count++;}
	        		
	        		if(ch[i+1]=='W')
		        	{	ch[i+1]='D';    count++;}
	        		
	        		if(ch[i+2]=='W')
		        	{	ch[i+2]='D';    count++;}
	        		
	        	}
	        	if(i==len-2 && ch[len-2]=='B')
	        	{
	        		
	        		if(ch[i+1]=='W')
		        	{	ch[i+1]='D';    count++;}
	        		
	        		if(ch[i-1]=='W')
		        	{	ch[i-1]='D';    count++;}
	        		
	        		if(ch[i-2]=='W')
		        	{	ch[i-2]='D';    count++;}
	        		
	        	}
	        	if(i==len-1 && ch[len-1]=='B')
	        	{
	        		
	        		if(ch[i-1]=='W')
		        	{	ch[i-1]='D';    count++;}
	        		
	        		if(ch[i-2]=='W')
		        	{	ch[i-2]='D';    count++;}
	        		
	        	}
	        }
	        
	        System.out.println(count);
		   // System.out.println(Arrays.toString(ch));
	        
	        
	        
	    }
	    
	    
	}

}
