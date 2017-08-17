package qsp;

import java.util.Scanner;

import javax.xml.ws.Action;
import javax.xml.ws.soap.Addressing;

import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterGroups;

import com.gargoylesoftware.htmlunit.html.FormFieldWithNameHistory;

public class StringFunctions {

	public static void main(String[] args) {
		String s1="I Love Java and I Love Selenium I Love mt";
		String s3,s4;
//		System.out.println(s1.replaceFirst("Love","l"));
//		//vvvvvvvvvvvvvIMP
//		System.out.println(s1.replace("Love", "")==s1.replaceAll("Love", ""));
//		System.out.println((s1.length() - s1.replace("Love","").length())/"Love".length());//number of time love is present
//		System.out.println(s1.startsWith(""));
//		System.out.println(s1.startsWith("I   "));
//		System.out.println("compare--->"+"AA".compareTo("ZA     ewsf"));
//		System.out.println("endsWith---> "+s1.endsWith(""));
		System.out.println("Main starts");
		
		s3="ABCDngissdffsdfe";
//		char chars[]=s3.toCharArray();
//		System.out.println("----->"+(char)(chars[2]+1));
//		System.out.println(chars[2]++);
//		System.out.println(++chars[2]);//vvvvvvvvvvvvvvvIMP
		
//		 s4="        Hello        ";
//		System.out.println(s4=s4.trim());
		s3="JAVADeveloper";
//		System.out.println(s3.subSequence(4,7));
//		System.out.println(s3.substring(4));
//		System.out.println(s3.substring(4,s3.length()-6));
//		System.out.println(s3.substring(s3.length()-1));
//		System.out.println(s3.substring(4, 7));
		s3="Welcome Dh to stackoverflow.com";
		System.out.println(s3.substring(8,s3.indexOf("to stack")));
		System.out.println(s3.substring(8,s3.indexOf(" ",10)));
		System.out.println(s3.lastIndexOf("m"));
	
		
		
//Write a program to print character of string with substring function
		String divyash="Divyash";
		String s="\n";
		for(int i=0;i<divyash.length();i++)
		{
			System.out.print(divyash.substring(i,i+1)+"    ");
		}
		
		
	}


	
}
