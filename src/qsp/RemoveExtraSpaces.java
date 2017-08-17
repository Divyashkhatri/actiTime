package qsp;

import java.util.Scanner;

public class RemoveExtraSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine(),str1="";
		
		if(str.charAt(0)!=' ')
			str1=str1+str.charAt(0);
		int len=str.length(),i;
		for(i=1;i<len;i++){
			if(!(str.charAt(i)==' ' && str.charAt(i-1)==' ')){
				str1=str1+str.charAt(i);	
			}	
		}
		System.out.println(str1);
	}
}
