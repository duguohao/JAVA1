import java.util.Scanner;

public class trst2 {

	public trst2() {
		// TODO Auto-generated constructor stub
		Scanner stdin=new Scanner(System.in);
		
		System.out.println("请输入");
		int cla=stdin.nextInt();
		int cla2=stdin.nextInt();
		
		int a=0;
		int b=0;
		for(int i=0;i>=cla;i++) {
			if(cla%2==1) {
			a+=cla;
			}
		}
		for(int c=0;c>=cla2;c++) {
			if(cla2%2==1) {
			b+=cla2;
			}
			
			
		}
		System.out.println(a+b);
		
	}
	public static void main(String[]args) {
		new trst2();
	}

}
