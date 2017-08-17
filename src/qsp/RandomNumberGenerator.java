package qsp;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumberGenerator {
//values from .00000000001 to .999999999
	public static void main(String[] args) {
		// generate a random number from 0 to 9
		System.out.println((int)(10*Math.random())); //0.0 to 0.99
		
		// generate a random number
		//System.out.println((int)(10*Math.random())+1); //0.0 to 0.99
	
	//	for(int i=0;i<10;i++)
		//System.out.println((int)(10*Math.random())+1);
		
		//generate 10 unique numbers
		Set set=new LinkedHashSet();
		while(set.size()<10)
		{
			int k=(int)(10*Math.random())+1;
			set.add(k);
		}
	System.out.println(set);
	}

}
