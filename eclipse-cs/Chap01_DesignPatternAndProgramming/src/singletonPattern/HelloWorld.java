package singletonPattern;
class Singleton{
	private static class singleInstanceHoler{
		private static final Singleton instance = new Singleton();
	}
	public static Singleton getInstance() {
		return singleInstanceHoler.instance;
	}
}
public class HelloWorld {

	public static void main(String[] args) {
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		if(a==b) {
			System.out.println(true);
		}
	}

}
