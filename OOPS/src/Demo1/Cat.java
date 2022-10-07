package Demo1;

public class Cat {
	/*
	Instance variables: states of cat
	 */
	String name;
	int age;
	String color;
	String breed;
	/*
	 instance method : behaviors of cat
	 
	 and there is no curly brace required for creating method only ()
	 */

	void play() {
		System.out.println("Cat is :"+" playing");
	}
	void sleep() {
		System.out.println("Cat is :"+"Sleeping");
	}
	void feed() {
		System.out.println("Cat is :"+" Eating");
	}

	public static void main(String[] args) {
		/*
		 * creating object
		 */
		Cat thor=new Cat();
		Cat Rambo=new Cat();
		//Defining thor cat;
		thor.name="thor";
		thor.age=23;
		thor.color="brown";
		thor.breed="pomarenian";
		thor.sleep();
		//Defining Rambo Cat;
		Rambo.name="Rambo";
		Rambo.age=23;
		Rambo.color="dark grey";
		Rambo.breed="Russian white";
		Rambo.feed();
	}

}
