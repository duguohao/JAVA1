import java.util.Scanner;

public class Breaktext {

	public Breaktext() {

		Scanner stdin=new Scanner(System.in);
		int b=stdin.nextInt();
		int sum=0;
		for(int i=0; i<=b;i++) {
			sum+=i;
			if(sum<1000) {
				
				System.out.println(sum);
				
				
			} else if(sum>1000) {
				
				System.out.println(sum/b);
			}
		}
	}
	public static void main(String[]agrs) {
		new Breaktext();
	}

}
