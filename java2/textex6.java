import java.util.Scanner;

public class textex6 {

	public textex6() {
		int sum=0;
		int cnt=0;
		while(true) {
			Scanner stdin=new Scanner(System.in);
			System.out.println("input num");
			int num=stdin.nextInt();
			cnt++;
			sum+=num;
			
			if(sum>=1000) 
				break;
			
		
	}
		System.out.println("sum is"+sum);
		System.out.println("avg is"+sum/cnt);
	}
	public static void main(String[]agrs) {
		new textex6();
	}
}


