package qsp;
class Orange{}

public class ConversionObjectToString {

	public static void main(String[] args) {
		Orange o1=new Orange();
		String s1=o1.toString();
		s1=new Orange().toString();
	}

}
