package qsp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionArrayToArrayList {

	public static void main(String[] args) {
		//if it is non primitive array
		Integer arr[]={22,222,2221,23};
		List l=new ArrayList(Arrays.asList(arr));
		System.out.println(l);
		//2nd way
		List l12=Arrays.asList(arr);
		
		// if array is of primitive type
		int ar1[]={453,534,34,34};
		//How do you convert a array to list ?
		char ch[]=new char[26];
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=(char) ('A'+i);
		}
		List<Character> a=new ArrayList<Character>();
		System.out.println(a.getClass());
		for(char c:ch)
		a.add(c);  //     for(int i=0;i<ch.length;i++) a.add(ch[i]);
		for(int i=0;i<a.size();i++)
		System.out.print((int)a.get(i)+" ");
		System.out.println();
		for(int i=0;i<a.size();i++)
		System.out.print(a.get(i)+"  ");
		
		//2nd 
		Integer in[]={22,3,3,33};
		List<Integer> ls = Arrays.asList(in);
		System.out.println(ls);
		//drawback of aslist method is we cant add more element
		
		//3rd method this works only for wrapper arrayInterger array Byte array
		ArrayList lst=new ArrayList<>(Arrays.asList(in));
		System.out.println(lst);
	}

}
