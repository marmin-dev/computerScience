package objectOrientedProgramming;

class Animal{
	public void bark() {
		System.out.println("mumu");
	}
}
class Dog extends Animal{
	@Override
	public void bark() {
		System.out.println("walwal");
	}
	
}

public class OverrideEx1 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
	}
}
