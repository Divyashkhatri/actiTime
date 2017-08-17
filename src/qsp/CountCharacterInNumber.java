package qsp;

public class CountCharacterInNumber {

	public static void main(String[] args) {
		int i=12345;
		//1st way
		System.out.println(Integer.toString(i).length());
		int count=0;
		//2nd way
		while(i>0)
		{
			i=i/10;
			count++;
		}
		System.out.println("Number of character :-->"+count);
	}

}
