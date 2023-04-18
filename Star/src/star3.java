import java.util.Scanner;

public class star3 {

	public star3() {
		Scanner stdin=new Scanner(System.in);
		System.out.println("import score");
		int num=stdin.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println(" ");
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
				
				
			}
		}
	}
	public static void main(String[]args) {
		new star3();
	}
}
