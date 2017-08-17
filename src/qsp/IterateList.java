package qsp;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateList {

	public static void main(String[] args) {
		ArrayList lst= new ArrayList();
		lst.add(10);
		lst.add(111);
		lst.add(11);
		//1st way
		Iterator ti = lst.iterator();
		while(ti.hasNext())
		{
			System.out.println(ti.next());
		}
		
		//2nd way
		for(int i=0;i<lst.size();i++)
			System.out.println(lst.get(i));
		
	}

}
