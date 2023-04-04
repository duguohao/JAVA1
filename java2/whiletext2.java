import java.util.Scanner;

public class whiletext2 {

	public whiletext2() {
		Scanner stdin=new Scanner(System.in);
		System.out.println("请输入");
		int fac=stdin.nextInt();
		int facvalue=stdin.nextInt();
		while(fac>0) {
			
			System.out.print(fac+"*");
			facvalue=facvalue*fac--;
		}
		
		System.out.println("!="+facvalue);
		
	}
	public static void main(String[]args) {
		new whiletext2();
	}

}
