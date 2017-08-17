package qsp;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConversionArrayListToLinkedList {
//How do you convert an arraylist to linked list ?
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<>();
		arr.add("hello ");
		arr.add("How ");
		arr.add("are ");
		arr.add("you ");
		arr.add("divyash ");
		arr.add("? ");
		//1st way to convert arraylist tolinkedlist
		// we can pass arraylist to linklist constructor
		LinkedList<String> ll1= new LinkedList<>(arr);
		String ss=ll1.get(0);
		String ss1=ll1.get(1);
		System.out.print(ss+ss1);
		
		//2nd way to convert arraylist tolinkedlist
		LinkedList<String> ll= new LinkedList<>();
		ll.add(arr.get(2));
		String s=ll.get(0);

		ll.add(arr.get(3));
		String s1=ll.get(1);
		System.out.println(s+s1);		
	}
}
