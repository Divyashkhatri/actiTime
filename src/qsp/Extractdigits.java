package qsp;

public class Extractdigits {

	public static void main(String[] args) {
		String s="MANAGER12JOB3213567";
		for(int i=0;i<s.length();i++)
		{
			try{
				int z=Integer.parseInt(""+s.charAt(i));
				System.out.println(z);
		}
			catch(Exception e)
			{
				
			}
		}

	}

}
