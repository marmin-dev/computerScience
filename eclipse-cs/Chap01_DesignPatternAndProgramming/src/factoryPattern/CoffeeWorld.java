package factoryPattern;

abstract class Coffee{
	public abstract int getPrice();
	
	@Override
	public String toString() {
		return "hi there! It's "+this.getPrice();
	}
}

class coffeeFactory {
	public static Coffee getCoffee(String type, int price) {
		if("Latte".equalsIgnoreCase(type)) return new Latte(price);
		else if ("Americano".equalsIgnoreCase(type)) {
			return new Americano(price);
		}else {
			return new DefaultCoffee();
		}
	}
}

class DefaultCoffee extends Coffee{
	private int price;
	
	public DefaultCoffee() {
		this.price = -1;
	}
	@Override
	public int getPrice() {
		return this.price;
	}
}

class Latte extends Coffee{
	private int price;
	
	public Latte(int price) {
		this.price = price;
	}
	@Override
	public int getPrice() {
		return this.price;
	}
}

class Americano extends Coffee{
	private int price;
	
	public Americano(int price) {
		this.price = price;
	}
	@Override
	public int getPrice() {
		return this.price;
	}
}

public class CoffeeWorld {

	public static void main(String[] args) {
		Coffee latte1 = coffeeFactory.getCoffee("Latte", 4000);
		Coffee ame = coffeeFactory.getCoffee("Americano", 4000);
		System.out.println(latte1);
		System.out.println(ame);
	}

}
