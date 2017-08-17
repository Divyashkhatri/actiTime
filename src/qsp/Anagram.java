package qsp;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		int a[]=new int[]{2,3,4,5};
		int a1[]=new int[]{2,3,4,5};
		System.out.println(Arrays.toString(a));
		if(	Arrays.toString(a).equals(Arrays.toString(a1)))
		{
			System.out.println("its anagram");
		}
	}

}
