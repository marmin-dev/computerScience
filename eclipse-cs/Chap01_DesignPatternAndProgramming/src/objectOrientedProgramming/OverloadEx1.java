package objectOrientedProgramming;


class Person{
	public void eat(String a) {
		System.out.println("I eat "+ a);
	}
	public void eat(String a, String b) {
		System.out.println("I eat " +a+" and " +b);
	}
}

public class OverloadEx1 {
	public static void main(String[] args) {
		Person a = new Person();
		a.eat("pizza");
		a.eat("hamburger","pizza");
	}

}
