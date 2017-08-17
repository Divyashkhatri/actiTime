package qsp;
import static java.lang.System.*;
import java.util.*;
public class OccuranceOfdigitInRange {
	

	
	static int test(int x,int y,int n)
	{
		int count=0,rem,temp;
		for(int i=x;i<=y;i++)
		{	temp=i;
			while(temp>0)
			{
				rem=temp%10;
				if(rem==n)
					count++;
				temp=temp/10;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		out.println(test(1,100,5));//if we import static then all static members gets imported
		String str="I Love";
		String s[] = str.split(" ");
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
		String str1="";
		ArrayList lst= new ArrayList();
		lst.add(10);
		lst.add(111);
	//	float ft=0  * 2.5; double can't be assigned to float.
		float ft1=(float)1_1_1.00; // 111.00
		float ft11=1_1_1.00f;
		System.out.println(ft1);
		System.out.println(ft11);
		lst.add(11);
		Iterator ti = lst.iterator();
		while(ti.hasNext())
		{
			System.out.println(ti.next());
		}
		System.out.println();
		System.out.println(lst.size());
		int no=8;
		while(no>0)
		{
			int rem=no%2;
			str1=str1+rem;
			no=no/2;
			
		}
		for(int i=str1.length()-1;i>=0;i--)
		{
			System.out.print(str1.charAt(i));
		}
	
	
	}

}
