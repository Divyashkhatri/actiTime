package qsp;
class Animal
{
	void speak()
	{
		System.out.println("Animal Speaking");
	}
	
}
class Mammal extends Animal
{
	void speak()
	{
		System.out.println("mammal speaking");
	}
}

class Cat extends Mammal
{
	void speak()
	{
		System.out.print("Meowww ");
	}
	 void speak(int n)
	 {
		 for(int i=0;i<n;i++)
		 {
			 this.speak();
		 }
	 }
	 static void speak(String s)
	 {
		 System.out.println(s);
	 }
	
}
public class PolymorphismExample {

	public static void main(String[] args) {
		
		Cat b1=new Cat();
		//b1.speak(5);
		b1.speak();
		b1.speak("boww bhow");
	}

}
