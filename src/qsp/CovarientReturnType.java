package qsp;
import java.applet.Applet;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import generic.AutoConst;
import generic.Excel;
interface IDEMO
{
	 static void test()
	{
		System.out.println("test");
	}
	default void meth()
	{
		System.out.println("Hello");
		
	}

}
class Apple
{
	Apple getApple()
	{
		return this;
	}
}
class CovarientReturnType implements IDEMO
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
//		Apple a1=new Apple();
//		Apple a2=a1.getApple();
//		System.out.println(a1==a2);
//		
//		
//	IDEMO ID=new CovarientReturnType();	
//		ID.meth();
//		IDEMO.test();
//		ID.test();//calling static method using 
		
		
//			int x=1,y=1,z=0;
//			while(!(x++>1 && y++>1)){
//				z=x+y;
//				System.out.println(x+" "+y+" "+z);
//			}
//			System.out.println(z);
		
		
		System.out.println("start");
		
		
		Excel.setCellValue("","", 1,1, "");
		
		System.out.println("End");
		
		
		
		
		
		

		
//System.out.println(A);//A is not a variable so error
//	char[] c={'i','n','g'};
//	String b[]={"a","b","c"};
//	int a[]={1,2,3};
//	long l[]={2l,4l};
//	System.out.println("l="+l);
//	System.out.println(a);
//	System.out.println("a="+a);
//	System.out.println(b);
//	System.out.println("b="+b);
//	System.out.println(c);
//	System.out.println("c="+c);
//	char ch='a';
//	System.out.println(ch);
//	System.out.println("ch="+ch);
//    char abc[]={'a'};
//    System.out.println(abc);







		

	
	
	}

	
}