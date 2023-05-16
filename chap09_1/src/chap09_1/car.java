package chap09_1;

public class car {
	int speed;
	void run() {
		System.out.println("???????????");
	}
	public static void main(String[]args) {
	//	speed=50;//x
		car c=new car();
		c.speed=60;
		c.run();
	}
}
