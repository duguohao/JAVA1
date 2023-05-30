package chap11;
class Item{
	public int price;
}
class wodong{
	public int price;
	public int wodong() {
		return price=2500;
		
	}
	public String toString() {
		return "wodong";
	}
}
class buyer{
	private int money;
	public buyer(int money) {
		this.money=money;
	}
	public void buy(Item it,int count) {
		System.out.println(it+""+count);
		money=money-it.price*count;
		System.out.println("change"+money);
	}
}


public class Polymorphism {

	public static void main(String[]args) {
		buyer b=new buyer(20000);
		
	}
}
