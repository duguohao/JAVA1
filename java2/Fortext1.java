import java.util.Scanner;

public class Fortext1 {

	public Fortext1() {
		Scanner stdin=new Scanner(System.in);
		System.out.println("请输入");
		int num=stdin.nextInt();
		
		for(int i=1;i<=num;i++) {
		if(num%i==0) {
			System.out.println(i);
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static void main(String[]args) {
		new Fortext1();
	}
}
