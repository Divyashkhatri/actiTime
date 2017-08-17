package qsp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ConversionSetToList {

	public static void main(String[] args) {
		//How do you convert a set to a list ?
		Set<Long> ls=new TreeSet<Long>();
		
		ls.add((long) 21);
		ls.add((long) 22);
		ls.add((long) 22);
		ls.add((long) 20);
		ls.add((long) 23);
		ls.add((long) 19);
		//1st way to convert
		List<Long> ll=new LinkedList<Long>(ls);
		Object value;
		for(Long val:ll)
		System.out.println(val);
		
		//2nd way to convert
		System.out.print("enhance for loop---------->");
		System.out.println(ll.getClass());
		// here in link list we cannot find the size by in build size() functions so we can use iterator
		System.out.println(ll.get(0));// in this we can't use value by for loop for(;;)

		System.out.print("iterator---------->");
		Iterator<Long> itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
