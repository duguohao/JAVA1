import java.util.Scanner;

public class fortext2 {

	public fortext2() {
		Scanner stdin=new Scanner(System.in);
		System.out.println("请输入");
		int d=stdin.nextInt();
		
		for(int i=0;i<=d;i++) {
			System.out.println(" ");
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
		}
	}

	public static void main(String[] args) {
			new fortext2();

	}

}
