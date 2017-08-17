package qsp;

import com.gargoylesoftware.htmlunit.javascript.host.Symbol;

public class StringClassExample {

	public static void main(String[] args) {
	
		
		String s1=new String();
		String s2=new String("");//empty string or zero length string  vvvvvIMP
		String s3=new String(" "); //vvvvIMP length = 1
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s1==s2);
		
		s1="Hellollo";
		s1.concat("Hello");//ate biscuit returning value but we are not catching 
		System.out.println(s1);
		s1=s1.concat("Hello");// here we are creating object then assigning new address to 
		System.out.println(s1);
		
		
		System.out.println(s1.isEmpty());// if length > 0 return false    vvvvvIMP
		System.out.println(s2.isEmpty());// if length = 0 it return true 
		System.out.println("s1 contains hello--->8"+s1.contains("Hello"));
		
		// equals method
		s1="Hellollo";
		s2="Hellollo";
		s3=new String("Hellollo");
		System.out.println(s1.equals(s1));//here comparing address inside equals method
		System.out.println(s1.equals(s2));//here both reference variable refered to the same object because object is created in constant pool
		System.out.println(s1.equals(s3));//here value are same 
		System.out.println("s1.equals(\"Hellollo\")---->"+s1.equals("Hellollo"));
		System.out.println(new String("Hello").equals(new String("Hello")));//vvvvvvvvvvvvvIMP
		"".equals("");//vvvvvvvvvvIMP
		System.out.println("Hello".length());
		String s5="";
		System.out.println(s5);//zero length string
		System.out.println("s5.equals(\"\")-->"+s5.equals(""));
		
		
		s1="Hello";
		System.out.println(s1.equals("HeLLo"));//false because cases are different
		System.out.println(s1.equalsIgnoreCase("HELLO"));//here Ignore cases
		
		//indexof
		s1="javaDevloper";
		System.out.println(s1.indexOf('D'));
		System.out.println(s1.indexOf("Dev"));
		System.out.println(s1.indexOf('a'));//first occurance
		System.out.println(s1.indexOf('a',2));
		System.out.println(s1.indexOf("Dev", 4));//if it is not present it return -1
		
		
		s1="ASHOKA IS A VERY GOOD WARRIOR";
		int index=0;
		int cntr=0;
		while(s1.indexOf('A',index) != -1)
		{
			
			index=s1.indexOf('A',index);
			cntr++;
			index=index+1;
		}System.out.println("Ais rep-->"+cntr);
		
		//search number of times in love a string "I LOVE JAVA AND I LOVE SELENIUM AND I LOVE MT AND I LOVE MY INDIA"
		s1="I LOVE JAVA AND I LOVE SELENIUM AND I LOVE MT AND I LOVE MY INDIA";
		String srchword="LOVE";
		index=0;
		cntr=0;
		while((index=s1.indexOf(srchword,index))!=-1)
		{
			index=index+srchword.length();
			cntr++;
		}
		System.out.println("number of times LOve word repeated--->"+cntr);
	
	//write a program to find number of occurance of java using replace function
	
	System.out.println(s1.replace('e','E'));
	System.out.println(s1.replace("E","Engineer"));
	System.out.println(s1.replace("LOVE","l"));
	
	//use in regular expression
	System.out.println(s1.replaceAll("l","L"));

	System.out.println(s1.charAt(0));
	System.out.println(s1.charAt(s1.length()-1));
	System.out.println("--------------------");
	for(int i=0;i<s1.length();i++)
	System.out.println(s1);
	
	StringBuffer sb2=new StringBuffer("Hello");
	StringBuilder sb3=new StringBuilder("Hello");
	//equals method is not overridden in string builder and String buffer
	
	
	
	s1="java";
	s1=new StringBuilder(s1).reverse().toString();
	System.out.println(s1);
	
	
	
	
	
	
	
	
	
	
	}
	

}
