package qsp;
public class RecursiveReverseString 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println(reverse(".hsayvid si eman ym"));
	}
	public static String reverse(String str)
	{
		if ((str==null)||(str. length() <= 1) )
			return str;
		return  reverse(str. substring(1)) + str. charAt(0);
	}
}
