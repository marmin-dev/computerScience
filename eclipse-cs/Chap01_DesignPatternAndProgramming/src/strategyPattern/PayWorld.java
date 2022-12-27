package strategyPattern;

import java.util.ArrayList;
import java.util.List;

interface PaymentStrategy{
	public void pay(int amount);
}

class KAKAOCardStrategy implements PaymentStrategy{
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public KAKAOCardStrategy(String name, String cardNumber,
			String cvv, String dateOfExpiry) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using KAKAO Card");
		
	}
}
class LUNACardStrategy implements PaymentStrategy{
	private String emailId;
	private String password;
	
	public LUNACardStrategy(String email, String pwd) {
		this.emailId = email;
		this.password = pwd;
	}
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using LUNA Card");
	}
}
class Item{
	private String name;
	private int price;
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}

class ShoppingCart{
	List<Item> items;
	public ShoppingCart() {
		this.items = new ArrayList<>();
	}
	public void addItem(Item item) {
		this.items.add(item);
	}
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	public int calculateTotal() {
		int sum = 0;
		for(Item item : items) {
			sum += item.getPrice();
		}
		return sum;
	}
	public void pay(PaymentStrategy payment) {
		int amount = calculateTotal();
		payment.pay(amount);
	}
}

public class PayWorld {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item A = new Item("cigarette", 4500);
		Item B = new Item("lighter", 800);
		
		cart.addItem(A);
		cart.addItem(B);
		
		cart.pay(new LUNACardStrategy("marmin@aaa.com", "lulu"));
		
		cart.pay(new KAKAOCardStrategy("marmin", "12345", "123", "12/12"));
	}

}
