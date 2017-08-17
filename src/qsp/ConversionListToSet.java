package qsp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public class ConversionListToSet {

	public static void main(String[] args) {
	//	How do you convert a list to a set ?
		List<Double> dl=new LinkedList<Double>();
		for(double i=0.0;i<=100.0;i++)
		{
			dl.add(i+0.1);
			//System.out.print(dl.get((int)i)+" ");
		}
		//1st way
		Set<Double> ds1=new HashSet<Double>(dl);

		//System.out.println(dl.size());
		//2nd way
		Set<Double> ds=new HashSet<Double>();
			ds.addAll(dl);	
			//1st way to traverse 
			System.out.print(ds.size()+"-------------------------");
			Iterator<Double> itr=ds.iterator();
			while(itr.hasNext())
				System.out.print(itr.next()+" ");
			
			//2st way to traverse 
			System.out.print("\n"+ds.size()+"-------------------------");
			for(double value:ds)
			System.out.print(value+" ");
		
	}

}
