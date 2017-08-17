package qsp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConversionLinkedlistToArraylist {
//How do you convert a linkedlist to arraylist ?
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(94144);
		l.add(25894);
		l.addFirst(+91);  int i;
		//create a link list and pass it to arraylist constructor
		//1st way to convert LinkedList to ArrayList
		List<Integer> a=new ArrayList<Integer>(l);
		for(Integer v:a)
		System.out.print(v);
		System.out.println();
		
		//2nd way to convert Arraylist to linkedlist
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for(i=0;i<l.size();i++)
		a1.add(l.get(i));
		
		for(i=0;i<l.size();i++)
		System.out.print(a1.get(i));	
	
		
	
	}
}