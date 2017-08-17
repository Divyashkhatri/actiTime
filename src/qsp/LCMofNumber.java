package qsp;

public class LCMofNumber 
{
	static int gcd(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		else
		{
			return gcd(b,a%b);
		}
	}
	static int lcm(int a,int b)
	{
		int lcm_=(a*b)/gcd(a,b);
		return lcm_;
	}
	public static void main(String[] args) 
	{
		System.out.println(gcd(12,20));
		System.out.println(lcm(12,20));
	}
}
