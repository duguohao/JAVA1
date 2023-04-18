import java.util.Scanner;

public class Star2 {

	public Star2() {
		Scanner stdin=new Scanner(System.in);
		System.out.println("import score");
		int num=stdin.nextInt();
		int i=1;
		while (i<=num) {
			int j=1;
			while(j<=i) {
			System.out.print("*");
			j+=1;
			}
			System.out.println();
			i+=1;
			
		}
	}
	public static void main(String[]args) {
		new Star2();
	}

}
